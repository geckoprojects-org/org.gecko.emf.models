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
 * A representation of the model object '<em><b>Line Placed Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getRelativeRotation <em>Relative Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getGraphic <em>Graphic</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLinePlacedGraphicType()
 * @model extendedMetaData="name='LinePlacedGraphicType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LinePlacedGraphicType extends CompoundStrokeSectionType {
	/**
	 * Returns the value of the '<em><b>Relative Rotation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Property "relativeRotation" wird die relative Drehung des Graphic zur Linie gesteuert. Fehlt das Property, so wird der Wert "none" angenommen.
	 * 
	 * Zur Bedeutung siehe die Beschreibung bei RelativeRotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Rotation</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType
	 * @see #isSetRelativeRotation()
	 * @see #unsetRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLinePlacedGraphicType_RelativeRotation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='relativeRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativeRotationType getRelativeRotation();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getRelativeRotation <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Rotation</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType
	 * @see #isSetRelativeRotation()
	 * @see #unsetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @generated
	 */
	void setRelativeRotation(RelativeRotationType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getRelativeRotation <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @generated
	 */
	void unsetRelativeRotation();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getRelativeRotation <em>Relative Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Rotation</em>' attribute is set.
	 * @see #unsetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @generated
	 */
	boolean isSetRelativeRotation();

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das in einem LinePlacedGraphic zu platzierende Graphic. Auf das Graphic wirkt eine zusätzliche Drehungsoption, mit deren Hilfe das Graphic mit der Richtung der Linie abgestimmt werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference.
	 * @see #setGraphic(GraphicType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLinePlacedGraphicType_Graphic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphic' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicType2 getGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType#getGraphic <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic</em>' containment reference.
	 * @see #getGraphic()
	 * @generated
	 */
	void setGraphic(GraphicType2 value);

} // LinePlacedGraphicType
