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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:RelatedTimeType provides a content model for indicating the relative position of an arbitrary member of the substitution group whose head is gml:AbstractTimePrimitive. It extends the generic gml:TimePrimitivePropertyType with an XML attribute relativePosition, whose value is selected from the set of 13 temporal relationships identified by Allen (1983)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.RelatedTimeType#getRelativePosition <em>Relative Position</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getRelatedTimeType()
 * @model extendedMetaData="name='RelatedTimeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RelatedTimeType extends TimePrimitivePropertyType {
	/**
	 * Returns the value of the '<em><b>Relative Position</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.RelativePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Position</em>' attribute.
	 * @see net.opengis.gml.gml.RelativePositionType
	 * @see #isSetRelativePosition()
	 * @see #unsetRelativePosition()
	 * @see #setRelativePosition(RelativePositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getRelatedTimeType_RelativePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relativePosition'"
	 * @generated
	 */
	RelativePositionType getRelativePosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.RelatedTimeType#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Position</em>' attribute.
	 * @see net.opengis.gml.gml.RelativePositionType
	 * @see #isSetRelativePosition()
	 * @see #unsetRelativePosition()
	 * @see #getRelativePosition()
	 * @generated
	 */
	void setRelativePosition(RelativePositionType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.RelatedTimeType#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativePosition()
	 * @see #getRelativePosition()
	 * @see #setRelativePosition(RelativePositionType)
	 * @generated
	 */
	void unsetRelativePosition();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.RelatedTimeType#getRelativePosition <em>Relative Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Position</em>' attribute is set.
	 * @see #unsetRelativePosition()
	 * @see #getRelativePosition()
	 * @see #setRelativePosition(RelativePositionType)
	 * @generated
	 */
	boolean isSetRelativePosition();

} // RelatedTimeType
