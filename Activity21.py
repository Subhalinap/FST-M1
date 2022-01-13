import pytest

def test_add():
    num1 = 3
    num2 = 4
    assert num1+num2 == 10

def test_subtract():
    num1 = 20
    num2 = 10
    assert num1-num2 == 10

def test_multiply():
    num1 = 5
    num2 = 6
    assert num1*num2 == 10

def test_divide():
    num1 = 10
    num2 = 2
    assert num1/num2 == 5    