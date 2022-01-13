import pytest

@pytest.fixture
def wallet_amount():
   amount = 0
   return amount

@pytest.mark.parametrize("earned, spent, expected", [ (23, 44, 56), (44, 98, 12)])
def test_transactions(wallet_amount, earned, spent, expected):

    wallet_amount += earned

    wallet_amount -= spent

    assert wallet_amount == expected