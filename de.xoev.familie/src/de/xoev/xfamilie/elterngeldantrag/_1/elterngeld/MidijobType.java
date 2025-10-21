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
 * A representation of the model object '<em><b>Midijob Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Midijob.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getNachweisMidijob <em>Nachweis Midijob</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMidijobType()
 * @model extendedMetaData="name='MidijobType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MidijobType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMidijobType_Zeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit Midijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zu den Wochenstunden je nach Tätigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit Midijob</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitMidijob()
	 * @see #unsetWochenstundenJeTaetigkeitMidijob()
	 * @see #setWochenstundenJeTaetigkeitMidijob(float)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMidijobType_WochenstundenJeTaetigkeitMidijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeitMidijob' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWochenstundenJeTaetigkeitMidijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit Midijob</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitMidijob()
	 * @see #unsetWochenstundenJeTaetigkeitMidijob()
	 * @see #getWochenstundenJeTaetigkeitMidijob()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeitMidijob(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWochenstundenJeTaetigkeitMidijob()
	 * @see #getWochenstundenJeTaetigkeitMidijob()
	 * @see #setWochenstundenJeTaetigkeitMidijob(float)
	 * @generated
	 */
	void unsetWochenstundenJeTaetigkeitMidijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wochenstunden Je Taetigkeit Midijob</em>' attribute is set.
	 * @see #unsetWochenstundenJeTaetigkeitMidijob()
	 * @see #getWochenstundenJeTaetigkeitMidijob()
	 * @see #setWochenstundenJeTaetigkeitMidijob(float)
	 * @generated
	 */
	boolean isSetWochenstundenJeTaetigkeitMidijob();

	/**
	 * Returns the value of the '<em><b>Nachweis Midijob</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Midijob</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMidijobType_NachweisMidijob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMidijob' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMidijob();

} // MidijobType
