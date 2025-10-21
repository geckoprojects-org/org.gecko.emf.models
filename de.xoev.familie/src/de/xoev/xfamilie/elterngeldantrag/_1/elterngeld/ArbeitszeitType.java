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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbeitszeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Arbeitszeit des antragstellenden Elternteils
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getArbeitszeitWochenstunden <em>Arbeitszeit Wochenstunden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getAbweichendeBezugsgroesse <em>Abweichende Bezugsgroesse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getArbeitszeitType()
 * @model extendedMetaData="name='ArbeitszeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArbeitszeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Arbeitszeit Wochenstunden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angabe der Arbeitszeit pro Woche in Stunden
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arbeitszeit Wochenstunden</em>' attribute.
	 * @see #setArbeitszeitWochenstunden(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getArbeitszeitType_ArbeitszeitWochenstunden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='arbeitszeitWochenstunden' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getArbeitszeitWochenstunden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getArbeitszeitWochenstunden <em>Arbeitszeit Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arbeitszeit Wochenstunden</em>' attribute.
	 * @see #getArbeitszeitWochenstunden()
	 * @generated
	 */
	void setArbeitszeitWochenstunden(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Abweichende Bezugsgroesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine abweichende berufsspezifische Anzahl von Wochenstunden, die einer Vollzeitbeschäftigung entspricht (z. B. bei Lehrern).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abweichende Bezugsgroesse</em>' attribute.
	 * @see #setAbweichendeBezugsgroesse(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getArbeitszeitType_AbweichendeBezugsgroesse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='abweichendeBezugsgroesse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAbweichendeBezugsgroesse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getAbweichendeBezugsgroesse <em>Abweichende Bezugsgroesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Bezugsgroesse</em>' attribute.
	 * @see #getAbweichendeBezugsgroesse()
	 * @generated
	 */
	void setAbweichendeBezugsgroesse(BigInteger value);

} // ArbeitszeitType
