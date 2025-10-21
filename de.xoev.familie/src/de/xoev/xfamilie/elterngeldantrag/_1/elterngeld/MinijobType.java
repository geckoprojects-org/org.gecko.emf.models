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
 * A representation of the model object '<em><b>Minijob Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Minijob.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getNachweisMinijob <em>Nachweis Minijob</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMinijobType()
 * @model extendedMetaData="name='MinijobType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MinijobType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitraum, in der die Tätigkeit ausgeführt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMinijobType_Zeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit Minijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, der Wochenstunden, die durchschnittlich gearbeitet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit Minijob</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitMinijob()
	 * @see #unsetWochenstundenJeTaetigkeitMinijob()
	 * @see #setWochenstundenJeTaetigkeitMinijob(float)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMinijobType_WochenstundenJeTaetigkeitMinijob()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeitMinijob' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWochenstundenJeTaetigkeitMinijob();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit Minijob</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitMinijob()
	 * @see #unsetWochenstundenJeTaetigkeitMinijob()
	 * @see #getWochenstundenJeTaetigkeitMinijob()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeitMinijob(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWochenstundenJeTaetigkeitMinijob()
	 * @see #getWochenstundenJeTaetigkeitMinijob()
	 * @see #setWochenstundenJeTaetigkeitMinijob(float)
	 * @generated
	 */
	void unsetWochenstundenJeTaetigkeitMinijob();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wochenstunden Je Taetigkeit Minijob</em>' attribute is set.
	 * @see #unsetWochenstundenJeTaetigkeitMinijob()
	 * @see #getWochenstundenJeTaetigkeitMinijob()
	 * @see #setWochenstundenJeTaetigkeitMinijob(float)
	 * @generated
	 */
	boolean isSetWochenstundenJeTaetigkeitMinijob();

	/**
	 * Returns the value of the '<em><b>Nachweis Minijob</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art des Einkommens, das voraussichtlich im Bemessungszeitraum erzielt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Minijob</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMinijobType_NachweisMinijob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMinijob' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMinijob();

} // MinijobType
