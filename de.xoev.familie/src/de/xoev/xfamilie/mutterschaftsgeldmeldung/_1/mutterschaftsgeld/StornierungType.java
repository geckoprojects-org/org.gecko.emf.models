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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stornierung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen <em>Stornokennzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#getDatensatzIDUrsprungsmeldung <em>Datensatz ID Ursprungsmeldung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getStornierungType()
 * @model extendedMetaData="name='stornierung_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StornierungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stornokennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stornokennzeichen</em>' attribute.
	 * @see #isSetStornokennzeichen()
	 * @see #unsetStornokennzeichen()
	 * @see #setStornokennzeichen(boolean)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getStornierungType_Stornokennzeichen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='stornokennzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isStornokennzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen <em>Stornokennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stornokennzeichen</em>' attribute.
	 * @see #isSetStornokennzeichen()
	 * @see #unsetStornokennzeichen()
	 * @see #isStornokennzeichen()
	 * @generated
	 */
	void setStornokennzeichen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen <em>Stornokennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStornokennzeichen()
	 * @see #isStornokennzeichen()
	 * @see #setStornokennzeichen(boolean)
	 * @generated
	 */
	void unsetStornokennzeichen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen <em>Stornokennzeichen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stornokennzeichen</em>' attribute is set.
	 * @see #unsetStornokennzeichen()
	 * @see #isStornokennzeichen()
	 * @see #setStornokennzeichen(boolean)
	 * @generated
	 */
	boolean isSetStornokennzeichen();

	/**
	 * Returns the value of the '<em><b>Datensatz ID Ursprungsmeldung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datensatz ID Ursprungsmeldung</em>' attribute.
	 * @see #setDatensatzIDUrsprungsmeldung(String)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getStornierungType_DatensatzIDUrsprungsmeldung()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='datensatzID.Ursprungsmeldung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatensatzIDUrsprungsmeldung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#getDatensatzIDUrsprungsmeldung <em>Datensatz ID Ursprungsmeldung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datensatz ID Ursprungsmeldung</em>' attribute.
	 * @see #getDatensatzIDUrsprungsmeldung()
	 * @generated
	 */
	void setDatensatzIDUrsprungsmeldung(String value);

} // StornierungType
