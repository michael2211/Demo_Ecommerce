@smoke

  Feature: Add to Wish list
    Scenario: Add HTC to wish list
      Given user Add HTC to Wishlist
      Then Success Message in green will appear



    Scenario: Check HTC add with QTY one
      Given user Add HTC toWishlist
      When User GoTo WishList
      Then HTC one QTY added






