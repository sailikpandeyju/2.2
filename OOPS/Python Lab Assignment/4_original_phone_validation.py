"""

Write a regular expression to validate a phone number

"""
import requests

api_url = "https://phonevalidation.abstractapi.com/v1/"
api_key = "863361e8a1434e8894711b600b374f22"


def validate_phone_number(phone_number):
    params = {
        'api_key': api_key,
        'phone': phone_number
    }
    response = requests.get(api_url, params=params)
    print(response.content)


validate_phone_number("+918902326461")
