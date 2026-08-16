"""Starter tests for Lab 2: Test Design Techniques.

Complete each TODO, then run from the project root with:

    pytest -v

For Part D you will also measure coverage with:

    pytest --cov=src --cov-report=term-missing
"""

import pytest

from src.pricing import ticket_price, discount
from src.scoring import bonus
from src.turnstile import Turnstile


# ---------------------------------------------------------------------------
# Part A. Equivalence partitioning for ticket_price.
# There are five partitions: age < 0 (invalid), 0 to 12 (child),
# 13 to 64 (adult), 65 to 120 (senior), age > 120 (invalid).
# One valid partition is done for you. Add the others.
# ---------------------------------------------------------------------------
def test_ticket_price_child_partition():
    assert ticket_price(8) == 50
    assert ticket_price(36) == 100
    assert ticket_price(110) == 60

    with pytest.raises(ValueError):
        ticket_price(-10)
    with pytest.raises(ValueError):
        ticket_price(1000)

# TODO: add one test per remaining partition
#   - adult   (for example 30) -> 100
#   - senior  (for example 70) -> 60
#   - age < 0   -> raises ValueError   (hint: pytest.raises)
#   - age > 120 -> raises ValueError


# ---------------------------------------------------------------------------
# Part B. Boundary value analysis for ticket_price.
# Test the values on and just beside each band edge: 0, 12, 13, 64, 65, 120,
# and the invalid neighbours -1 and 121.
# ---------------------------------------------------------------------------
def test_ticket_price_lower_boundaries():
    assert ticket_price(0) == 50
    assert ticket_price(12) == 50
    assert ticket_price(13) == 100
    # TODO: add 64 -> 100, 65 -> 60, 120 -> 60

# TODO: write a test that checks ticket_price(-1) and ticket_price(121)
#       each raise ValueError.


# ---------------------------------------------------------------------------
# Part C. Decision table for discount.
# Conditions: is_member (Y/N) and order_total >= 1000 (Y/N).
# Four rules, so four tests. One is done for you.
# ---------------------------------------------------------------------------
def test_discount_member_large_order():
    assert discount(True, 1500) == 15

# TODO: add the other three rules
#   - member,     order < 1000      -> 10
#   - non-member, order >= 1000     -> 5
#   - non-member, order < 1000      -> 0


# ---------------------------------------------------------------------------
# Part D. Branch coverage for bonus.
# Write the smallest set of tests that reaches 100% BRANCH coverage.
# Then run:  pytest --cov=src --cov-report=term-missing
# and confirm src/scoring.py reports no missing branches.
# ---------------------------------------------------------------------------
def test_bonus_high_score_member():
    assert bonus(95, True) == 150

# TODO: add a test that takes the FALSE side of both decisions,
#       for example bonus(50, False) == 0


# ---------------------------------------------------------------------------
# Part E. State transition testing for Turnstile.
# Test the two valid transitions and the two ignored events.
# One valid transition is done for you.
# ---------------------------------------------------------------------------
def test_turnstile_coin_unlocks():
    t = Turnstile()
    t.coin()
    assert t.state == "unlocked"

# TODO: add tests for
#   - unlocked + push -> locked
#   - locked   + push -> still locked (ignored)
#   - unlocked + coin -> still unlocked (ignored)
