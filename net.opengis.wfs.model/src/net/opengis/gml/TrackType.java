/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The track of a moving object is a sequence of specialized timeslices        that indicate the status of the object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TrackType#getMovingObjectStatus <em>Moving Object Status</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTrackType()
 * @model extendedMetaData="name='TrackType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TrackType extends HistoryPropertyType {
	/**
	 * Returns the value of the '<em><b>Moving Object Status</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.MovingObjectStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving Object Status</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTrackType_MovingObjectStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MovingObjectStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MovingObjectStatusType> getMovingObjectStatus();

} // TrackType
