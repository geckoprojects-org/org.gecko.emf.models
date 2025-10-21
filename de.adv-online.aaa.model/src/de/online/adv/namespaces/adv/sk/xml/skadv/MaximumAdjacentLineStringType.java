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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maximum Adjacent Line String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType#getAdditionalFilter <em>Additional Filter</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMaximumAdjacentLineStringType()
 * @model extendedMetaData="name='MaximumAdjacentLineStringType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MaximumAdjacentLineStringType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Additional Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das an dieser Stelle angebbare Prädikat schränkt die Suche nach weiteren zusammenhängenden Geometrieteilen über den Filter der laufenden Seletion hinaus ein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Filter</em>' containment reference.
	 * @see #setAdditionalFilter(AdditionalFilterType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMaximumAdjacentLineStringType_AdditionalFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalFilterType1 getAdditionalFilter();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType#getAdditionalFilter <em>Additional Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Filter</em>' containment reference.
	 * @see #getAdditionalFilter()
	 * @generated
	 */
	void setAdditionalFilter(AdditionalFilterType1 value);

} // MaximumAdjacentLineStringType
