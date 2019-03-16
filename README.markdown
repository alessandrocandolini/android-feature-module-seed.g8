A [Giter8][g8] opinionated template for gradle android library feature modules written in kotlin.

The aim of this template is to reduce some boilerplate when working in a multi-module android gradle project with feature modules. 

This is just a POC. 

The feature module is organised for now as a OOP 3-layer (view/business/access) clean architecture with 2-way bindings MVP pattern on the view layer. Only one interactor is generated automatically by the template, more interactors can be added manually to satify single responsibility when needed. Access/data layer can make use of a repository pattern, APIs are done using retrofit (that allows to focus on the api contract in a declarative and type safe manner, delegating to the library bulding to fill the implementation details). The view is implemented in a fragment. No DI framework in place, for now a simple service locator pattern (which does NOT provide inversion of control) is used to get (rather than provide) the dependencies, and the graph f dependencies has to be resolved manually. Service locator pattern here has another drawback: it's hard to override just few of the dependencies in the integration tests. Integration tests are done using mock okhttp server. 



Template license
----------------
Written in 2019 by A. Candolini <alessandro.candolini@gmail.com>

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
