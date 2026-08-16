"""Function under test for Lab 2, part two.

``bonus`` is the small function used in the lecture to show the
difference between statement coverage and branch coverage.
"""


def bonus(score: int, is_member: bool) -> int:
    """Return a bonus for a score and membership.

    Adds 100 when the score is above 90, and a further 50 when the
    customer is a member. A score of 88 for a non-member returns 0.
    """
    b = 0
    if score > 90:
        b = 100
    if is_member:
        b += 50
    return b
