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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Fill Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillType#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidFillType()
 * @model extendedMetaData="name='SolidFillType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SolidFillType extends FillType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Farbe des SolidFill-Objekts.
	 * 
	 * Die Auswahl der Farbe unterliegt dem Style, Es darf nur genau ein Color-Objekt geben das nach Auswahl über Style mit dem SolidFill-Objekt verbunden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidFillType_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColorType> getColor();

} // SolidFillType
