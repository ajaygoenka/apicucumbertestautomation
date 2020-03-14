@admin

Feature: Validate that SSN Check

  Scenario: Validate that SSN is off
    Given I create a new internal google profile service request to the /admin/serviceconfig endpoint
    Given I create a new internal google profile service request to the Ajay endpoint
    Given I create a new external google profile service request to the Raghav endpoint

