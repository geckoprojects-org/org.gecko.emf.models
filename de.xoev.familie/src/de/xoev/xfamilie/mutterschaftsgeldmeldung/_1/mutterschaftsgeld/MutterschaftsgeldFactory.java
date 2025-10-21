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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage
 * @generated
 */
@ProviderType
public interface MutterschaftsgeldFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MutterschaftsgeldFactory eINSTANCE = de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Angaben Entbindung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angaben Entbindung Type</em>'.
	 * @generated
	 */
	AngabenEntbindungType createAngabenEntbindungType();

	/**
	 * Returns a new object of class '<em>Angaben Mutterschaftsgeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angaben Mutterschaftsgeld Type</em>'.
	 * @generated
	 */
	AngabenMutterschaftsgeldType createAngabenMutterschaftsgeldType();

	/**
	 * Returns a new object of class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>'.
	 * @generated
	 */
	AntragstellenderElternteilMutterschaftsgeldmeldungRueckType createAntragstellenderElternteilMutterschaftsgeldmeldungRueckType();

	/**
	 * Returns a new object of class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>'.
	 * @generated
	 */
	AntragstellenderElternteilMutterschaftsgeldmeldungType createAntragstellenderElternteilMutterschaftsgeldmeldungType();

	/**
	 * Returns a new object of class '<em>Code Kennzeichen Mutterschaftsgeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Kennzeichen Mutterschaftsgeld Type</em>'.
	 * @generated
	 */
	CodeKennzeichenMutterschaftsgeldType createCodeKennzeichenMutterschaftsgeldType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>'.
	 * @generated
	 */
	MutterschaftsgeldmeldungAnforderung0501Type createMutterschaftsgeldmeldungAnforderung0501Type();

	/**
	 * Returns a new object of class '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>'.
	 * @generated
	 */
	MutterschaftsgeldmeldungRueckmeldung0502Type createMutterschaftsgeldmeldungRueckmeldung0502Type();

	/**
	 * Returns a new object of class '<em>Stornierung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stornierung Type</em>'.
	 * @generated
	 */
	StornierungType createStornierungType();

	/**
	 * Returns a new object of class '<em>Stornierung Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stornierung Type1</em>'.
	 * @generated
	 */
	StornierungType1 createStornierungType1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MutterschaftsgeldPackage getMutterschaftsgeldPackage();

} //MutterschaftsgeldFactory
