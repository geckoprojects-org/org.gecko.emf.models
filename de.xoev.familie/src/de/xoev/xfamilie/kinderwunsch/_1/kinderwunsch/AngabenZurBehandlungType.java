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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zur Behandlung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag <em>Erstantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getAktenzeichenVorherigerAntrag <em>Aktenzeichen Vorheriger Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getVorherigeBehandlungen <em>Vorherige Behandlungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAngabenZurBehandlungType()
 * @model extendedMetaData="name='AngabenZurBehandlungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZurBehandlungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Erstantrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erstantrag</em>' attribute.
	 * @see #isSetErstantrag()
	 * @see #unsetErstantrag()
	 * @see #setErstantrag(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAngabenZurBehandlungType_Erstantrag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='erstantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isErstantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag <em>Erstantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erstantrag</em>' attribute.
	 * @see #isSetErstantrag()
	 * @see #unsetErstantrag()
	 * @see #isErstantrag()
	 * @generated
	 */
	void setErstantrag(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag <em>Erstantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErstantrag()
	 * @see #isErstantrag()
	 * @see #setErstantrag(boolean)
	 * @generated
	 */
	void unsetErstantrag();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag <em>Erstantrag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Erstantrag</em>' attribute is set.
	 * @see #unsetErstantrag()
	 * @see #isErstantrag()
	 * @see #setErstantrag(boolean)
	 * @generated
	 */
	boolean isSetErstantrag();

	/**
	 * Returns the value of the '<em><b>Aktenzeichen Vorheriger Antrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aktenzeichen Vorheriger Antrag</em>' attribute.
	 * @see #setAktenzeichenVorherigerAntrag(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichenVorherigerAntrag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenVorherigerAntrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getAktenzeichenVorherigerAntrag <em>Aktenzeichen Vorheriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen Vorheriger Antrag</em>' attribute.
	 * @see #getAktenzeichenVorherigerAntrag()
	 * @generated
	 */
	void setAktenzeichenVorherigerAntrag(String value);

	/**
	 * Returns the value of the '<em><b>Vorherige Behandlungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorherige Behandlungen</em>' containment reference.
	 * @see #setVorherigeBehandlungen(VorherigeBehandlungenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAngabenZurBehandlungType_VorherigeBehandlungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vorherigeBehandlungen' namespace='##targetNamespace'"
	 * @generated
	 */
	VorherigeBehandlungenType getVorherigeBehandlungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getVorherigeBehandlungen <em>Vorherige Behandlungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorherige Behandlungen</em>' containment reference.
	 * @see #getVorherigeBehandlungen()
	 * @generated
	 */
	void setVorherigeBehandlungen(VorherigeBehandlungenType value);

} // AngabenZurBehandlungType
