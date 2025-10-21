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
 * A representation of the model object '<em><b>Line Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType#getPerpendicularOffset <em>Perpendicular Offset</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLineLabelType()
 * @model extendedMetaData="name='LineLabelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineLabelType extends LabelType3 {
	/**
	 * Returns the value of the '<em><b>Perpendicular Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung des Texts senkrecht zur Linie in einem LineLabel.
	 * 
	 * Bei 0 oder Weglassen erfolgt keine Verschiebung. Der Text wird entstprechend dem verticalAlignment entlang der Linie positioniert.
	 * 
	 * Ansonsten verschieben positive Werte nach links  und negative nach rechts. Bei Flächen bedeutet "nach links" ins Innere der Fläche und "nach rechts" ins Äußere der Fläche.
	 * Einheit ist die durch "mapLengthFactor" vorgegebene (Default: mm/100).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perpendicular Offset</em>' attribute.
	 * @see #isSetPerpendicularOffset()
	 * @see #unsetPerpendicularOffset()
	 * @see #setPerpendicularOffset(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLineLabelType_PerpendicularOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='perpendicularOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPerpendicularOffset();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType#getPerpendicularOffset <em>Perpendicular Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perpendicular Offset</em>' attribute.
	 * @see #isSetPerpendicularOffset()
	 * @see #unsetPerpendicularOffset()
	 * @see #getPerpendicularOffset()
	 * @generated
	 */
	void setPerpendicularOffset(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType#getPerpendicularOffset <em>Perpendicular Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerpendicularOffset()
	 * @see #getPerpendicularOffset()
	 * @see #setPerpendicularOffset(double)
	 * @generated
	 */
	void unsetPerpendicularOffset();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType#getPerpendicularOffset <em>Perpendicular Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perpendicular Offset</em>' attribute is set.
	 * @see #unsetPerpendicularOffset()
	 * @see #getPerpendicularOffset()
	 * @see #setPerpendicularOffset(double)
	 * @generated
	 */
	boolean isSetPerpendicularOffset();

} // LineLabelType
