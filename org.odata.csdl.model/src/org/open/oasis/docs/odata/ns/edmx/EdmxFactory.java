/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.open.oasis.docs.odata.ns.edmx;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage
 * @generated
 */
@ProviderType
public interface EdmxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmxFactory eINSTANCE = org.open.oasis.docs.odata.ns.edmx.impl.EdmxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	EdmxRoot createEdmxRoot();

	/**
	 * Returns a new object of class '<em>TData Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TData Services</em>'.
	 * @generated
	 */
	TDataServices createTDataServices();

	/**
	 * Returns a new object of class '<em>TEdmx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEdmx</em>'.
	 * @generated
	 */
	TEdmx createTEdmx();

	/**
	 * Returns a new object of class '<em>TInclude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInclude</em>'.
	 * @generated
	 */
	TInclude createTInclude();

	/**
	 * Returns a new object of class '<em>TInclude Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInclude Annotations</em>'.
	 * @generated
	 */
	TIncludeAnnotations createTIncludeAnnotations();

	/**
	 * Returns a new object of class '<em>TReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TReference</em>'.
	 * @generated
	 */
	TReference createTReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdmxPackage getEdmxPackage();

} //EdmxFactory
