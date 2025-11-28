/*
 */
package io.cloudevents.model.ce;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.cloudevents.model.ce.CloudEventsPackage
 * @generated
 */
@ProviderType
public interface CloudEventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudEventsFactory eINSTANCE = io.cloudevents.model.ce.impl.CloudEventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Event</em>'.
	 * @generated
	 */
	CloudEvent createCloudEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudEventsPackage getCloudEventsPackage();

} //CloudEventsFactory
