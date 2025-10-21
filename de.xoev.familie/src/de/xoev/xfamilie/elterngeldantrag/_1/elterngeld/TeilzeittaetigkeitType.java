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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teilzeittaetigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur abhängigen Beschäftigung des antragstellenden Elternteils vor Geburt des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getNachweisTeilzeit <em>Nachweis Teilzeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTeilzeittaetigkeitType()
 * @model extendedMetaData="name='TeilzeittaetigkeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TeilzeittaetigkeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTeilzeittaetigkeitType_Zeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit Teilzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, zu welchem Datum das Arbeitsverhältnis beendet wurde oder wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit Teilzeit</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #unsetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #setWochenstundenJeTaetigkeitTeilzeit(float)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTeilzeittaetigkeitType_WochenstundenJeTaetigkeitTeilzeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeitTeilzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWochenstundenJeTaetigkeitTeilzeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit Teilzeit</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #unsetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #getWochenstundenJeTaetigkeitTeilzeit()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeitTeilzeit(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #getWochenstundenJeTaetigkeitTeilzeit()
	 * @see #setWochenstundenJeTaetigkeitTeilzeit(float)
	 * @generated
	 */
	void unsetWochenstundenJeTaetigkeitTeilzeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wochenstunden Je Taetigkeit Teilzeit</em>' attribute is set.
	 * @see #unsetWochenstundenJeTaetigkeitTeilzeit()
	 * @see #getWochenstundenJeTaetigkeitTeilzeit()
	 * @see #setWochenstundenJeTaetigkeitTeilzeit(float)
	 * @generated
	 */
	boolean isSetWochenstundenJeTaetigkeitTeilzeit();

	/**
	 * Returns the value of the '<em><b>Nachweis Teilzeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Teilzeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getTeilzeittaetigkeitType_NachweisTeilzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisTeilzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisTeilzeit();

} // TeilzeittaetigkeitType
