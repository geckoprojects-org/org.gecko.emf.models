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
 * A representation of the model object '<em><b>Einkuenfte Beantragter Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben über die Einfünfte im beantragten Zeitraum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteBeantragterZeitraumType()
 * @model extendedMetaData="name='EinkuenfteBeantragterZeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkuenfteBeantragterZeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Zeitraum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteBeantragterZeitraumType_Zeitraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den durchschnittlichen Einkünften bei der Tätigkeit in Selbstständigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>' attribute.
	 * @see #isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit(float)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteBeantragterZeitraumType_DurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	float getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>' attribute.
	 * @see #isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 */
	void setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit(float)
	 * @generated
	 */
	void unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>' attribute is set.
	 * @see #unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit(float)
	 * @generated
	 */
	boolean isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit Selbststaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den Wochenstunden je Tätigkeit in Selbstständigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #unsetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #setWochenstundenJeTaetigkeitSelbststaendigkeit(float)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteBeantragterZeitraumType_WochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeitSelbststaendigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWochenstundenJeTaetigkeitSelbststaendigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>' attribute.
	 * @see #isSetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #unsetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeitSelbststaendigkeit(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #setWochenstundenJeTaetigkeitSelbststaendigkeit(float)
	 * @generated
	 */
	void unsetWochenstundenJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>' attribute is set.
	 * @see #unsetWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #setWochenstundenJeTaetigkeitSelbststaendigkeit(float)
	 * @generated
	 */
	boolean isSetWochenstundenJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns the value of the '<em><b>Nachweis Einkommenssteuerbescheid</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweis zur Einkommenssteuer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Einkommenssteuerbescheid</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteBeantragterZeitraumType_NachweisEinkommenssteuerbescheid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEinkommenssteuerbescheid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisEinkommenssteuerbescheid();

} // EinkuenfteBeantragterZeitraumType
