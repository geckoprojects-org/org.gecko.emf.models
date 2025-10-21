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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PreGraphicType#getLinePlacedGraphic <em>Line Placed Graphic</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPreGraphicType()
 * @model extendedMetaData="name='preGraphic_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PreGraphicType extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Placed Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinePlacedGraphic ist eine Art der CompoundStrokeSection, welche für ein Graphic steht, dass im Verlauf der Linie angeordnet wird.
	 * 
	 * Fehlt das Property "length", so wird es mit 0 angenommen. Wird "length" größerr als 0 angegeben, so wird die definierte Länge verwendet und das Graphic wird darauf mittig angeordnet.
	 * 
	 * Durch das Property "relativeRotation" wird die relative Drehung des Graphic zur Linie gesteuert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Placed Graphic</em>' containment reference.
	 * @see #setLinePlacedGraphic(LinePlacedGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPreGraphicType_LinePlacedGraphic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LinePlacedGraphic' namespace='##targetNamespace'"
	 * @generated
	 */
	LinePlacedGraphicType getLinePlacedGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PreGraphicType#getLinePlacedGraphic <em>Line Placed Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Placed Graphic</em>' containment reference.
	 * @see #getLinePlacedGraphic()
	 * @generated
	 */
	void setLinePlacedGraphic(LinePlacedGraphicType value);

} // PreGraphicType
