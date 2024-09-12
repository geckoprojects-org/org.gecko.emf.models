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
 * A representation of the model object '<em><b>Concatenated Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ordered sequence of two or more single coordinate operations. The sequence of operations is constrained by the requirement that the source coordinate reference system of step (n+1) must be the same as the target coordinate reference system of step (n). The source coordinate reference system of the first step and the target coordinate reference system of the last step are the source and target coordinate reference system associated with the concatenated operation. Instead of a forward operation, an inverse operation may be used for one or more of the operation steps mentioned above, if the inverse operation is uniquely defined by the forward operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.ConcatenatedOperationType#getUsesSingleOperation <em>Uses Single Operation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getConcatenatedOperationType()
 * @model extendedMetaData="name='ConcatenatedOperationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConcatenatedOperationType extends AbstractCoordinateOperationType {
	/**
	 * Returns the value of the '<em><b>Uses Single Operation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SingleOperationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered sequence of associations to the two or more single operations used by this concatenated operation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Single Operation</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getConcatenatedOperationType_UsesSingleOperation()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='usesSingleOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleOperationRefType> getUsesSingleOperation();

} // ConcatenatedOperationType
