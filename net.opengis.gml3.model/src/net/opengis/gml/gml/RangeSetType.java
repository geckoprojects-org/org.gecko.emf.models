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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.RangeSetType#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.RangeSetType#getAbstractScalarValueListGroup <em>Abstract Scalar Value List Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.RangeSetType#getAbstractScalarValueList <em>Abstract Scalar Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.RangeSetType#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.gml.RangeSetType#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType()
 * @model extendedMetaData="name='RangeSetType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RangeSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Array</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.ValueArrayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Value Array is used for homogeneous arrays of primitive and aggregate values.  
	 * The member values may be scalars, composites, arrays or lists.
	 * ValueArray has the same content model as CompositeValue, but the member values shall be homogeneous.  The element declaration contains a Schematron constraint which expresses this restriction precisely.  Since the members are homogeneous, the gml:referenceSystem (uom, codeSpace) may be specified on the gml:ValueArray itself and inherited by all the members if desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Array</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType_ValueArray()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueArray' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueArrayType> getValueArray();

	/**
	 * Returns the value of the '<em><b>Abstract Scalar Value List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractScalarValueList is an abstract element which acts as the head of a substitution group which contains gml:BooleanList, gml:CategoryList, gml:CountList and gml:QuantityList, and (transitively) the elements in their substitution groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Scalar Value List Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType_AbstractScalarValueListGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractScalarValueList:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractScalarValueListGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Scalar Value List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractScalarValueList is an abstract element which acts as the head of a substitution group which contains gml:BooleanList, gml:CategoryList, gml:CountList and gml:QuantityList, and (transitively) the elements in their substitution groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Scalar Value List</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType_AbstractScalarValueList()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractScalarValueList' namespace='##targetNamespace' group='AbstractScalarValueList:group'"
	 * @generated
	 */
	EList<EObject> getAbstractScalarValueList();

	/**
	 * Returns the value of the '<em><b>Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:DataBlock describes the Range as a block of text encoded values similar to a Common Separated Value (CSV) representation.
	 * The range set parameterization is described by the property gml:rangeParameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Block</em>' containment reference.
	 * @see #setDataBlock(DataBlockType)
	 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType_DataBlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	DataBlockType getDataBlock();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.RangeSetType#getDataBlock <em>Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Block</em>' containment reference.
	 * @see #getDataBlock()
	 * @generated
	 */
	void setDataBlock(DataBlockType value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * for efficiency reasons, GML also provides a means of encoding the range set in an arbitrary external encoding, such as a binary file.  This encoding may be "well-known" but this is not required. This mode uses the gml:File element.
	 * The values of the coverage (attribute values in the range set) are transmitted in a external file that is referenced from the XML structure described by gml:FileType.  The external file is referenced by the gml:fileReference property that is an anyURI (the gml:fileName property has been deprecated).  This means that the external file may be located remotely from the referencing GML instance. 
	 * The gml:compression property points to a definition of a compression algorithm through an anyURI.  This may be a retrievable, computable definition or simply a reference to an unambiguous name for the compression method.
	 * The gml:mimeType property points to a definition of the file mime type.
	 * The gml:fileStructure property is defined by a codelist. Note further that all values shall be enclosed in a single file. Multi-file structures for values are not supported in GML.
	 * The semantics of the range set is described as above using the gml:rangeParameters property.
	 * Note that if any compression algorithm is applied, the structure above applies only to the pre-compression or post-decompression structure of the file.
	 * Note that the fields within a record match the gml:valueComponents of the gml:CompositeValue in document order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(FileType)
	 * @see net.opengis.gml.gml.GMLPackage#getRangeSetType_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getFile();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.RangeSetType#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(FileType value);

} // RangeSetType
