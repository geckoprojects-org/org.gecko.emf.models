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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage
 * @generated
 */
@ProviderType
public interface AllgemeineNachrichtenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllgemeineNachrichtenFactory eINSTANCE = de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allgemeinenachrichten Quittung0011 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allgemeinenachrichten Quittung0011 Type</em>'.
	 * @generated
	 */
	AllgemeinenachrichtenQuittung0011Type createAllgemeinenachrichtenQuittung0011Type();

	/**
	 * Returns a new object of class '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>'.
	 * @generated
	 */
	AllgemeinenachrichtenRueckweisung0001Type createAllgemeinenachrichtenRueckweisung0001Type();

	/**
	 * Returns a new object of class '<em>Code Rueckweisungsgrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Rueckweisungsgrund Type</em>'.
	 * @generated
	 */
	CodeRueckweisungsgrundType createCodeRueckweisungsgrundType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Rueckweisende Stelle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rueckweisende Stelle Type</em>'.
	 * @generated
	 */
	RueckweisendeStelleType createRueckweisendeStelleType();

	/**
	 * Returns a new object of class '<em>Rueckweisungsgrund Spezifisch Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rueckweisungsgrund Spezifisch Type</em>'.
	 * @generated
	 */
	RueckweisungsgrundSpezifischType createRueckweisungsgrundSpezifischType();

	/**
	 * Returns a new object of class '<em>Rueckweisungsgrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rueckweisungsgrund Type</em>'.
	 * @generated
	 */
	RueckweisungsgrundType createRueckweisungsgrundType();

	/**
	 * Returns a new object of class '<em>Transportinformationen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transportinformationen Type</em>'.
	 * @generated
	 */
	TransportinformationenType createTransportinformationenType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllgemeineNachrichtenPackage getAllgemeineNachrichtenPackage();

} //AllgemeineNachrichtenFactory
