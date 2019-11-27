module com.guicedee.guicedpersistence.c3p0 {

	exports com.guicedee.guicedpersistence.c3p0;

	requires com.guicedee.guicedpersistence;
	requires com.guicedee.guicedpersistence.readers.hibernateproperties;
	requires com.guicedee.guicedinjection;
	requires java.validation;
	requires java.sql;
	requires com.guicedee.guicedpersistence.jpa;
	requires com.google.guice;

	requires java.persistence;

	provides com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader with com.guicedee.guicedpersistence.c3p0.implementations.C3P0ConnectionPropertiesReader;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.guicedee.guicedpersistence.c3p0.implementations.C3P0ModuleExclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.guicedee.guicedpersistence.c3p0.implementations.C3P0ModuleExclusions;

}