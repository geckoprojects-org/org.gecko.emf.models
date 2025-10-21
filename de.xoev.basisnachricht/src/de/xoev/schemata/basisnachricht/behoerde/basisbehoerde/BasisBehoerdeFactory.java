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
package de.xoev.schemata.basisnachricht.behoerde.basisbehoerde;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdePackage
 * @generated
 */
@ProviderType
public interface BasisBehoerdeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisBehoerdeFactory eINSTANCE = de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behoerde Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behoerde Type</em>'.
	 * @generated
	 */
	BehoerdeType createBehoerdeType();

	/**
	 * Returns a new object of class '<em>Code Verzeichnisdienst Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Verzeichnisdienst Type</em>'.
	 * @generated
	 */
	CodeVerzeichnisdienstType createCodeVerzeichnisdienstType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasisBehoerdePackage getBasisBehoerdePackage();

} //BasisBehoerdeFactory
