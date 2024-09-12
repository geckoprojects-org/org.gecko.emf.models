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
package net.opengis.ogc;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Operands Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.GeometryOperandsType#getGeometryOperand <em>Geometry Operand</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getGeometryOperandsType()
 * @model extendedMetaData="name='GeometryOperandsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeometryOperandsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry Operand</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Operand</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getGeometryOperandsType_GeometryOperand()
	 * @model unique="false" dataType="net.opengis.ogc.GeometryOperandType" required="true"
	 *        extendedMetaData="kind='element' name='GeometryOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getGeometryOperand();

} // GeometryOperandsType
