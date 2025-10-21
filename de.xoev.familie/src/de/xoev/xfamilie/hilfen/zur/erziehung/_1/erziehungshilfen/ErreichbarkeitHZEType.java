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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erreichbarkeit HZE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Erweiterung der Erreichbarkeit um die Abfrage "Wann können wir Sie erreichen?"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType#getZeitErreichbarkeitHZE <em>Zeit Erreichbarkeit HZE</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getErreichbarkeitHZEType()
 * @model extendedMetaData="name='ErreichbarkeitHZEType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErreichbarkeitHZEType extends ErreichbarkeitType {
	/**
	 * Returns the value of the '<em><b>Zeit Erreichbarkeit HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wann können wir Sie erreichen?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeit Erreichbarkeit HZE</em>' attribute.
	 * @see #setZeitErreichbarkeitHZE(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getErreichbarkeitHZEType_ZeitErreichbarkeitHZE()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zeitErreichbarkeitHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeitErreichbarkeitHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType#getZeitErreichbarkeitHZE <em>Zeit Erreichbarkeit HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeit Erreichbarkeit HZE</em>' attribute.
	 * @see #getZeitErreichbarkeitHZE()
	 * @generated
	 */
	void setZeitErreichbarkeitHZE(String value);

} // ErreichbarkeitHZEType
