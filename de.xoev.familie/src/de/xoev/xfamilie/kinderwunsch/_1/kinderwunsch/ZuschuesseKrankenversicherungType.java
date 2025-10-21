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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zuschuesse Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligteKrankenkassen <em>Beteiligte Krankenkassen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungGKV <em>Zusaetzliche Beteiligung GKV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungPKV <em>Zusaetzliche Beteiligung PKV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligungBeihilfe <em>Beteiligung Beihilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNachweiseRechnungen <em>Nachweise Rechnungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType()
 * @model extendedMetaData="name='ZuschuesseKrankenversicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZuschuesseKrankenversicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beteiligte Krankenkassen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beteiligte Krankenkassen</em>' attribute.
	 * @see #setBeteiligteKrankenkassen(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='beteiligteKrankenkassen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeteiligteKrankenkassen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligteKrankenkassen <em>Beteiligte Krankenkassen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beteiligte Krankenkassen</em>' attribute.
	 * @see #getBeteiligteKrankenkassen()
	 * @generated
	 */
	void setBeteiligteKrankenkassen(String value);

	/**
	 * Returns the value of the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negativbescheinigung Versicherung Kostentraeger</em>' containment reference.
	 * @see #setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='negativbescheinigungVersicherungKostentraeger' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNegativbescheinigungVersicherungKostentraeger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negativbescheinigung Versicherung Kostentraeger</em>' containment reference.
	 * @see #getNegativbescheinigungVersicherungKostentraeger()
	 * @generated
	 */
	void setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType value);

	/**
	 * Returns the value of the '<em><b>Zusaetzliche Beteiligung GKV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zusaetzliche Beteiligung GKV</em>' containment reference.
	 * @see #setZusaetzlicheBeteiligungGKV(ZusaetzlicheBeteiligungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusaetzlicheBeteiligungGKV' namespace='##targetNamespace'"
	 * @generated
	 */
	ZusaetzlicheBeteiligungType getZusaetzlicheBeteiligungGKV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungGKV <em>Zusaetzliche Beteiligung GKV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusaetzliche Beteiligung GKV</em>' containment reference.
	 * @see #getZusaetzlicheBeteiligungGKV()
	 * @generated
	 */
	void setZusaetzlicheBeteiligungGKV(ZusaetzlicheBeteiligungType value);

	/**
	 * Returns the value of the '<em><b>Zusaetzliche Beteiligung PKV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zusaetzliche Beteiligung PKV</em>' containment reference.
	 * @see #setZusaetzlicheBeteiligungPKV(ZusaetzlicheBeteiligungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusaetzlicheBeteiligungPKV' namespace='##targetNamespace'"
	 * @generated
	 */
	ZusaetzlicheBeteiligungType getZusaetzlicheBeteiligungPKV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungPKV <em>Zusaetzliche Beteiligung PKV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusaetzliche Beteiligung PKV</em>' containment reference.
	 * @see #getZusaetzlicheBeteiligungPKV()
	 * @generated
	 */
	void setZusaetzlicheBeteiligungPKV(ZusaetzlicheBeteiligungType value);

	/**
	 * Returns the value of the '<em><b>Beteiligung Beihilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beteiligung Beihilfe</em>' containment reference.
	 * @see #setBeteiligungBeihilfe(ZusaetzlicheBeteiligungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_BeteiligungBeihilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beteiligungBeihilfe' namespace='##targetNamespace'"
	 * @generated
	 */
	ZusaetzlicheBeteiligungType getBeteiligungBeihilfe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligungBeihilfe <em>Beteiligung Beihilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beteiligung Beihilfe</em>' containment reference.
	 * @see #getBeteiligungBeihilfe()
	 * @generated
	 */
	void setBeteiligungBeihilfe(ZusaetzlicheBeteiligungType value);

	/**
	 * Returns the value of the '<em><b>Nachweise Rechnungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweise Rechnungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getZuschuesseKrankenversicherungType_NachweiseRechnungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweiseRechnungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweiseRechnungenType> getNachweiseRechnungen();

} // ZuschuesseKrankenversicherungType
