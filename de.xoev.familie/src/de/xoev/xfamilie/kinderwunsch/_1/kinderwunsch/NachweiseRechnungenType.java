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

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise Rechnungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungsdatum <em>Rechnungsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungssteller <em>Rechnungssteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getSummeGesamtkosten <em>Summe Gesamtkosten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType()
 * @model extendedMetaData="name='NachweiseRechnungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseRechnungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rechnungsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rechnungsdatum</em>' attribute.
	 * @see #setRechnungsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType_Rechnungsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='rechnungsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRechnungsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungsdatum <em>Rechnungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rechnungsdatum</em>' attribute.
	 * @see #getRechnungsdatum()
	 * @generated
	 */
	void setRechnungsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Rechnungssteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rechnungssteller</em>' attribute.
	 * @see #setRechnungssteller(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType_Rechnungssteller()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='rechnungssteller' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRechnungssteller();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungssteller <em>Rechnungssteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rechnungssteller</em>' attribute.
	 * @see #getRechnungssteller()
	 * @generated
	 */
	void setRechnungssteller(String value);

	/**
	 * Returns the value of the '<em><b>Betrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betrag</em>' attribute.
	 * @see #setBetrag(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType_Betrag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='betrag' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getBetrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getBetrag <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag</em>' attribute.
	 * @see #getBetrag()
	 * @generated
	 */
	void setBetrag(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Summe Gesamtkosten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summe Gesamtkosten</em>' attribute.
	 * @see #setSummeGesamtkosten(BigDecimal)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType_SummeGesamtkosten()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='summeGesamtkosten' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSummeGesamtkosten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getSummeGesamtkosten <em>Summe Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summe Gesamtkosten</em>' attribute.
	 * @see #getSummeGesamtkosten()
	 * @generated
	 */
	void setSummeGesamtkosten(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference.
	 * @see #setNachweis(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseRechnungenType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getNachweis <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis</em>' containment reference.
	 * @see #getNachweis()
	 * @generated
	 */
	void setNachweis(NachweisdokumentType value);

} // NachweiseRechnungenType
