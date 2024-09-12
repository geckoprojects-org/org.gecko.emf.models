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

import java.math.BigInteger;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Exends GridFunctionType with a lookUpTable.  This contains a list of indexes of members within the rangeSet corresponding with the members of the domainSet.  The domainSet is traversed in list order if it is enumerated explicitly, or in the order specified by a SequenceRule if the domain is an implicit set.    The length of the lookUpTable corresponds with the length of the subset of the domainSet for which the coverage is defined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.IndexMapType#getLookUpTable <em>Look Up Table</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getIndexMapType()
 * @model extendedMetaData="name='IndexMapType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IndexMapType extends GridFunctionType {
	/**
	 * Returns the value of the '<em><b>Look Up Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look Up Table</em>' attribute.
	 * @see #setLookUpTable(List)
	 * @see net.opengis.gml.GMLPackage#getIndexMapType_LookUpTable()
	 * @model dataType="net.opengis.gml.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='lookUpTable' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getLookUpTable();

	/**
	 * Sets the value of the '{@link net.opengis.gml.IndexMapType#getLookUpTable <em>Look Up Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look Up Table</em>' attribute.
	 * @see #getLookUpTable()
	 * @generated
	 */
	void setLookUpTable(List<BigInteger> value);

} // IndexMapType
