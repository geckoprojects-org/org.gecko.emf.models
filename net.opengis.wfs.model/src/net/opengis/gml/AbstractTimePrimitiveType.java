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
 * A representation of the model object '<em><b>Abstract Time Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract supertype for temporal primitives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractTimePrimitiveType#getRelatedTime <em>Related Time</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractTimePrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimePrimitiveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractTimePrimitiveType extends AbstractTimeObjectType {
	/**
	 * Returns the value of the '<em><b>Related Time</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.RelatedTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Time</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getAbstractTimePrimitiveType_RelatedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedTimeType> getRelatedTime();

} // AbstractTimePrimitiveType
