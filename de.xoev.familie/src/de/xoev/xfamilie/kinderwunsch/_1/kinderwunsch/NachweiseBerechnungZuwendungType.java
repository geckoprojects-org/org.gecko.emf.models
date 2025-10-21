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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise Berechnung Zuwendung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getZuschuesseKrankenversicherung <em>Zuschuesse Krankenversicherung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseBerechnungZuwendungType()
 * @model extendedMetaData="name='NachweiseBerechnungZuwendungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseBerechnungZuwendungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negativbescheinigung Versicherung Kostentraeger</em>' containment reference.
	 * @see #setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='negativbescheinigungVersicherungKostentraeger' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNegativbescheinigungVersicherungKostentraeger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negativbescheinigung Versicherung Kostentraeger</em>' containment reference.
	 * @see #getNegativbescheinigungVersicherungKostentraeger()
	 * @generated
	 */
	void setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType value);

	/**
	 * Returns the value of the '<em><b>Zuschuesse Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zuschuesse Krankenversicherung</em>' containment reference.
	 * @see #setZuschuesseKrankenversicherung(ZuschuesseKrankenversicherungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zuschuesseKrankenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	ZuschuesseKrankenversicherungType getZuschuesseKrankenversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getZuschuesseKrankenversicherung <em>Zuschuesse Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zuschuesse Krankenversicherung</em>' containment reference.
	 * @see #getZuschuesseKrankenversicherung()
	 * @generated
	 */
	void setZuschuesseKrankenversicherung(ZuschuesseKrankenversicherungType value);

} // NachweiseBerechnungZuwendungType
