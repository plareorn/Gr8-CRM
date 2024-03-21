Feature: Default

	#{color:#de350b}+*US:*+ {color}
	#
	#As a Hr user, I should be able to access the Employees page.
	#
	# 
	#
	#{color:#de350b}+*AC1:*+{color}
	#
	# Verify that the user views the following 8 modules in the Employees page.
	#    Company Structure
	#    Find Employee
	#    Telephone Directory
	#    Staff Changes
	#    Efficiency Report
	#    Honored Employees
	#    Birthdays
	#    New page
	@B32G8-216
	Scenario: Verify that the Hr user can views the following 8 modules in the Employees page.
		Given the user is logged in as a "hr"
		    When  user click on Employees button
		    Then the user should see the following options on Employees page:
		      | Company Structure   |
		      | Find Employee       |
		      | Telephone Directory |
		      | Staff Changes       |
		      | Efficiency Report   |
		      | Honored Employees   |
		      | Birthdays           |
		      | New page            |