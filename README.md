# 💳 Stripe Payment Integration with Spring Boot

This project demonstrates how to integrate **Stripe Checkout** in a Spring Boot application. Users can create a checkout session by posting product details, and Stripe will handle the payment securely.

---

## 📦 Package Structure

text
com.payment.stripe_payment
├── controller
│   └── ProductCheckoutController.java
├── dto
│   ├── ProductRequest.java
│   └── StripeResponse.java
├── service
│   └── StripeService.java
🚀 API Endpoint
POST /product/v1/checkout
Creates a Stripe Checkout session for a product.

📥 Request Body (ProductRequest.java)
json
```
{
  "amount": 2000,
  "quantity": 1,
  "name": "Premium T-Shirt",
  "currency": "usd"
}

```
Field	Type	Description
amount	Long	Amount in the smallest currency unit (e.g., 2000 = $20)
quantity	Long	Quantity of the product
name	String	Product name or description
currency	String	ISO currency code (usd, eur, etc.)

📤 Response (StripeResponse.java)
json
```
{
  "sessionId": "cs_test_a1b2c3d4e5",
  "checkoutUrl": "https://checkout.stripe.com/pay/cs_test_a1b2c3d4e5"
}

```
Field	Type	Description
sessionId	String	Stripe checkout session ID
checkoutUrl	String	URL where the user is redirected to pay

💳 Stripe Test Cards
Use these test card numbers to simulate different scenarios:

Scenario	Card Number	Exp Date	CVC	Result
## 💳 Stripe Test Cards

Use the following test cards provided by Stripe:

| Scenario             | Card Number            | Exp Date | CVC | Result                    |
|----------------------|------------------------|----------|-----|---------------------------|
| Successful Payment   | `4242 4242 4242 4242`  | Any      | Any | ✅ Payment succeeds        |
| 3D Secure Required   | `4000 0027 6000 3184`  | Any      | Any | 🔒 Requires authentication |
| Payment Declined     | `4000 0000 0000 9995`  | Any      | Any | ❌ Declined                |
| Insufficient Funds   | `4000 0000 0000 9995`  | Any      | Any | ❌ Declined                |


Use any valid future expiry date (e.g., 12/34) and 3-digit CVC (e.g., 123)
