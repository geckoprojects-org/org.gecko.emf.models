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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The base type for coverages is gml:AbstractCoverageType. The basic elements of a coverage can be seen in this content model: the coverage contains gml:domainSet and gml:rangeSet properties. The gml:domainSet property describes the domain of the coverage and the gml:rangeSet property describes the range of the coverage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractCoverageType#getDomainSetGroup <em>Domain Set Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoverageType#getDomainSet <em>Domain Set</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoverageType#getRangeSet <em>Range Set</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoverageType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractCoverageType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Domain Set Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainSet property element describes the spatio-temporal region of interest, within which the coverage is defined. Its content model is given by gml:DomainSetType.
	 * The value of the domain is thus a choice between a gml:AbstractGeometry and a gml:AbstractTimeObject.  In the instance these abstract elements will normally be substituted by a geometry complex or temporal complex, to represent spatial coverages and time-series, respectively.  
	 * The presence of the gml:AssociationAttributeGroup means that domainSet follows the usual GML property model and may use the xlink:href attribute to point to the domain, as an alternative to describing the domain inline. Ownership semantics may be provided using the gml:OwnershipAttributeGroup.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Set Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoverageType_DomainSetGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='domainSet:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDomainSetGroup();

	/**
	 * Returns the value of the '<em><b>Domain Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainSet property element describes the spatio-temporal region of interest, within which the coverage is defined. Its content model is given by gml:DomainSetType.
	 * The value of the domain is thus a choice between a gml:AbstractGeometry and a gml:AbstractTimeObject.  In the instance these abstract elements will normally be substituted by a geometry complex or temporal complex, to represent spatial coverages and time-series, respectively.  
	 * The presence of the gml:AssociationAttributeGroup means that domainSet follows the usual GML property model and may use the xlink:href attribute to point to the domain, as an alternative to describing the domain inline. Ownership semantics may be provided using the gml:OwnershipAttributeGroup.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Set</em>' containment reference.
	 * @see #setDomainSet(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoverageType_DomainSet()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainSet' namespace='##targetNamespace' group='domainSet:group'"
	 * @generated
	 */
	DomainSetType getDomainSet();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoverageType#getDomainSet <em>Domain Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Set</em>' containment reference.
	 * @see #getDomainSet()
	 * @generated
	 */
	void setDomainSet(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Range Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:rangeSet property element contains the values of the coverage (sometimes called the attribute values).  Its content model is given by gml:RangeSetType.
	 * This content model supports a structural description of the range.  The semantic information describing the range set is embedded using a uniform method, as part of the explicit values, or as a template value accompanying the representation using gml:DataBlock and gml:File.
	 * The values from each component (or "band") in the range may be encoded within a gml:ValueArray element or a concrete member of the gml:AbstractScalarValueList substitution group . Use of these elements satisfies the value-type homogeneity requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Set</em>' containment reference.
	 * @see #setRangeSet(RangeSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoverageType_RangeSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rangeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeSetType getRangeSet();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoverageType#getRangeSet <em>Range Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Set</em>' containment reference.
	 * @see #getRangeSet()
	 * @generated
	 */
	void setRangeSet(RangeSetType value);

} // AbstractCoverageType
