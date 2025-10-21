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

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Wohnsitz.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftInland <em>Anschrift Inland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftType()
 * @model extendedMetaData="name='AnschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anschrift Inland Oder Ausland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Anschrift, wenn =true, ist AnschriftInland, wenn =false, dann AnschriftAusland zu befüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Inland Oder Ausland</em>' attribute.
	 * @see #isSetAnschriftInlandOderAusland()
	 * @see #unsetAnschriftInlandOderAusland()
	 * @see #setAnschriftInlandOderAusland(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftType_AnschriftInlandOderAusland()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='anschriftInlandOderAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnschriftInlandOderAusland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Inland Oder Ausland</em>' attribute.
	 * @see #isSetAnschriftInlandOderAusland()
	 * @see #unsetAnschriftInlandOderAusland()
	 * @see #isAnschriftInlandOderAusland()
	 * @generated
	 */
	void setAnschriftInlandOderAusland(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnschriftInlandOderAusland()
	 * @see #isAnschriftInlandOderAusland()
	 * @see #setAnschriftInlandOderAusland(boolean)
	 * @generated
	 */
	void unsetAnschriftInlandOderAusland();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anschrift Inland Oder Ausland</em>' attribute is set.
	 * @see #unsetAnschriftInlandOderAusland()
	 * @see #isAnschriftInlandOderAusland()
	 * @see #setAnschriftInlandOderAusland(boolean)
	 * @generated
	 */
	boolean isSetAnschriftInlandOderAusland();

	/**
	 * Returns the value of the '<em><b>Anschrift Inland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angaben zur Inlandsadresse des antragstellenden Elternteils, verpflichtende Angabe, wenn anschriftInlandOderAusland = true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Inland</em>' containment reference.
	 * @see #setAnschriftInland(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftType_AnschriftInland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftInland' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType getAnschriftInland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftInland <em>Anschrift Inland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Inland</em>' containment reference.
	 * @see #getAnschriftInland()
	 * @generated
	 */
	void setAnschriftInland(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angaben zur Auslandsadresse des antragstellenden Elternteils, verpflichtende Angabe, wenn anschriftInlandOderAusland = false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #setAnschriftAusland(AuslandsanschriftType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftType_AnschriftAusland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsanschriftType getAnschriftAusland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftAusland <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #getAnschriftAusland()
	 * @generated
	 */
	void setAnschriftAusland(AuslandsanschriftType value);

} // AnschriftType
