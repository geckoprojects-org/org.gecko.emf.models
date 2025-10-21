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

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finanzierungsplan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getGesamtkosten <em>Gesamtkosten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungGesetzlicheKrankenkasse <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungPrivateKrankenkasse <em>Voraussichtliche Erstattung Private Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungBeihilfe <em>Voraussichtliche Erstattung Beihilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungHeilfuersorge <em>Voraussichtliche Erstattung Heilfuersorge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVerbleibenderEigenanteilSelbstkostenanteil <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getZuwendungenGesamt <em>Zuwendungen Gesamt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType()
 * @model extendedMetaData="name='FinanzierungsplanType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FinanzierungsplanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gesamtkosten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesamtkosten</em>' attribute.
	 * @see #setGesamtkosten(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_Gesamtkosten()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='gesamtkosten' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGesamtkosten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getGesamtkosten <em>Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesamtkosten</em>' attribute.
	 * @see #getGesamtkosten()
	 * @generated
	 */
	void setGesamtkosten(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Voraussichtliche Erstattung Gesetzliche Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>' attribute.
	 * @see #setVoraussichtlicheErstattungGesetzlicheKrankenkasse(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='voraussichtlicheErstattungGesetzlicheKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVoraussichtlicheErstattungGesetzlicheKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungGesetzlicheKrankenkasse <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>' attribute.
	 * @see #getVoraussichtlicheErstattungGesetzlicheKrankenkasse()
	 * @generated
	 */
	void setVoraussichtlicheErstattungGesetzlicheKrankenkasse(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Voraussichtliche Erstattung Private Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voraussichtliche Erstattung Private Krankenkasse</em>' attribute.
	 * @see #setVoraussichtlicheErstattungPrivateKrankenkasse(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='voraussichtlicheErstattungPrivateKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVoraussichtlicheErstattungPrivateKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungPrivateKrankenkasse <em>Voraussichtliche Erstattung Private Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtliche Erstattung Private Krankenkasse</em>' attribute.
	 * @see #getVoraussichtlicheErstattungPrivateKrankenkasse()
	 * @generated
	 */
	void setVoraussichtlicheErstattungPrivateKrankenkasse(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Voraussichtliche Erstattung Beihilfe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voraussichtliche Erstattung Beihilfe</em>' attribute.
	 * @see #setVoraussichtlicheErstattungBeihilfe(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='voraussichtlicheErstattungBeihilfe' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVoraussichtlicheErstattungBeihilfe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungBeihilfe <em>Voraussichtliche Erstattung Beihilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtliche Erstattung Beihilfe</em>' attribute.
	 * @see #getVoraussichtlicheErstattungBeihilfe()
	 * @generated
	 */
	void setVoraussichtlicheErstattungBeihilfe(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Voraussichtliche Erstattung Heilfuersorge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voraussichtliche Erstattung Heilfuersorge</em>' attribute.
	 * @see #setVoraussichtlicheErstattungHeilfuersorge(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='voraussichtlicheErstattungHeilfuersorge' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVoraussichtlicheErstattungHeilfuersorge();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungHeilfuersorge <em>Voraussichtliche Erstattung Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtliche Erstattung Heilfuersorge</em>' attribute.
	 * @see #getVoraussichtlicheErstattungHeilfuersorge()
	 * @generated
	 */
	void setVoraussichtlicheErstattungHeilfuersorge(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Verbleibender Eigenanteil Selbstkostenanteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbleibender Eigenanteil Selbstkostenanteil</em>' attribute.
	 * @see #setVerbleibenderEigenanteilSelbstkostenanteil(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='verbleibenderEigenanteilSelbstkostenanteil' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVerbleibenderEigenanteilSelbstkostenanteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVerbleibenderEigenanteilSelbstkostenanteil <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbleibender Eigenanteil Selbstkostenanteil</em>' attribute.
	 * @see #getVerbleibenderEigenanteilSelbstkostenanteil()
	 * @generated
	 */
	void setVerbleibenderEigenanteilSelbstkostenanteil(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Zuwendungen Gesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zuwendungen Gesamt</em>' attribute.
	 * @see #setZuwendungenGesamt(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getFinanzierungsplanType_ZuwendungenGesamt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='zuwendungenGesamt' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getZuwendungenGesamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getZuwendungenGesamt <em>Zuwendungen Gesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zuwendungen Gesamt</em>' attribute.
	 * @see #getZuwendungenGesamt()
	 * @generated
	 */
	void setZuwendungenGesamt(BigDecimal value);

} // FinanzierungsplanType
