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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rueckweisende Stelle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getPruefinstanz <em>Pruefinstanz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisendeStelleType()
 * @model extendedMetaData="name='RueckweisendeStelleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RueckweisendeStelleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pruefinstanz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird die Stelle bezeichnet, die die Nachricht beanstandet hat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefinstanz</em>' attribute.
	 * @see #setPruefinstanz(String)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisendeStelleType_Pruefinstanz()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='pruefinstanz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPruefinstanz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getPruefinstanz <em>Pruefinstanz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefinstanz</em>' attribute.
	 * @see #getPruefinstanz()
	 * @generated
	 */
	void setPruefinstanz(String value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisendeStelleType_Erreichbarkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

} // RueckweisendeStelleType
