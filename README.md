# Lab 2 — Test Design Techniques

Software Testing and Validation, Addis Ababa University.

Accompanies Unit 2. You will derive test cases using equivalence
partitioning, boundary value analysis, decision tables and state
transition testing, then measure branch coverage.

## Setup

    python -m venv .venv
    source .venv/bin/activate        # Windows: .venv\Scripts\activate
    pip install -r requirements.txt

## Run the tests

    pytest -v                                        # your work in tests/
    pytest solution -v                               # instructor solution
    pytest --cov=src --cov-report=term-missing       # coverage (Part D)

## Structure

    src/
      pricing.py     ticket_price (EP, BVA), discount (decision table)
      scoring.py     bonus (white-box coverage)
      turnstile.py   Turnstile (state transitions)
    tests/
      test_starter.py   complete the TODOs here
    solution/           full instructor solution

## What to submit

Your completed tests/test_starter.py and the coverage summary line for
src/scoring.py from Part D. See the lab manual for detail.
