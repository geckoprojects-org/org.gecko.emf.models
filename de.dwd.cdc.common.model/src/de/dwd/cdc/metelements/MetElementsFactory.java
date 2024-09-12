/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.dwd.cdc.metelements;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dwd.cdc.metelements.MetElementsPackage
 * @generated
 */
@ProviderType
public interface MetElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetElementsFactory eINSTANCE = de.dwd.cdc.metelements.impl.MetElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Met Def Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Met Def Root</em>'.
	 * @generated
	 */
	MetDefRoot createMetDefRoot();

	/**
	 * Returns a new object of class '<em>Met Element Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Met Element Definition Type</em>'.
	 * @generated
	 */
	MetElementDefinitionType createMetElementDefinitionType();

	/**
	 * Returns a new object of class '<em>Met Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Met Element Type</em>'.
	 * @generated
	 */
	MetElementType createMetElementType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetElementsPackage getMetElementsPackage();

} //MetElementsFactory
