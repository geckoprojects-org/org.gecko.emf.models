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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Telephone numbers for contacting the responsible individual or organization. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.TelephoneType#getVoice <em>Voice</em>}</li>
 *   <li>{@link net.opengis.ows.TelephoneType#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getTelephoneType()
 * @model extendedMetaData="name='TelephoneType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TelephoneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telephone number by which individuals can speak to the responsible organization or individual. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voice</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getTelephoneType_Voice()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Voice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getVoice();

	/**
	 * Returns the value of the '<em><b>Facsimile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telephone number of a facsimile machine for the responsible
	 * organization or individual. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getTelephoneType_Facsimile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Facsimile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFacsimile();

} // TelephoneType
