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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resturlaub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe, ob Resturlaub aus der Zeit vor der Geburt im Bezugszeitraum genommen wird.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlTage <em>Anzahl Tage</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlDerWochenstunden <em>Anzahl Der Wochenstunden</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getResturlaubType()
 * @model extendedMetaData="name='ResturlaubType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResturlaubType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzahl Tage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Tage</em>' attribute.
	 * @see #setAnzahlTage(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getResturlaubType_AnzahlTage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='anzahlTage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAnzahlTage();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlTage <em>Anzahl Tage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Tage</em>' attribute.
	 * @see #getAnzahlTage()
	 * @generated
	 */
	void setAnzahlTage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getResturlaubType_Zeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Anzahl Der Wochenstunden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Der Wochenstunden</em>' attribute.
	 * @see #setAnzahlDerWochenstunden(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getResturlaubType_AnzahlDerWochenstunden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='anzahlDerWochenstunden' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAnzahlDerWochenstunden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlDerWochenstunden <em>Anzahl Der Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Der Wochenstunden</em>' attribute.
	 * @see #getAnzahlDerWochenstunden()
	 * @generated
	 */
	void setAnzahlDerWochenstunden(BigInteger value);

} // ResturlaubType
