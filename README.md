## Modified ant-colony example from Rich Hickey

Thanks for Baishampayan Ghose <b.ghose@gmail.com> to set this old demo up after 4 years

Modified by C. Minos Niu for Clojure Meetup Los Angeles

There are 3 processes running in parallel:

1. Arbitrary number of ants crawling for food and leaving phonosome,
1. Phonosome evaporating at certain decaying rates, and
1. An animation process that keeps drawing stuff

## Usage

run "src/demo/main.clj"

The concurrency is done by keeping multiple agent callling themselves
 
or

"src/demo/main-atat.clj"

For animation and evaporation, you'll see that I used overtone.at-at to schedule all updates synchronously.

