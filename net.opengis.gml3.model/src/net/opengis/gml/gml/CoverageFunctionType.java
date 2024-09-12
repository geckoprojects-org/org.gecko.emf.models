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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.CoverageFunctionType#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoverageFunctionType#getCoverageMappingRule <em>Coverage Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoverageFunctionType#getGridFunction <em>Grid Function</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getCoverageFunctionType()
 * @model extendedMetaData="name='CoverageFunctionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CoverageFunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rule</em>' containment reference.
	 * @see #setMappingRule(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoverageFunctionType_MappingRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MappingRule' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getMappingRule();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoverageFunctionType#getMappingRule <em>Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Rule</em>' containment reference.
	 * @see #getMappingRule()
	 * @generated
	 */
	void setMappingRule(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Coverage Mapping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CoverageMappingRule provides a formal or informal description of the coverage function.
	 * The mapping rule may be defined as an in-line string (gml:ruleDefinition) or via a remote reference through xlink:href (gml:ruleReference).  
	 * If no rule name is specified, the default is 'Linear' with respect to members of the domain in document order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Mapping Rule</em>' containment reference.
	 * @see #setCoverageMappingRule(MappingRuleType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoverageFunctionType_CoverageMappingRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageMappingRule' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingRuleType getCoverageMappingRule();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoverageFunctionType#getCoverageMappingRule <em>Coverage Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Mapping Rule</em>' containment reference.
	 * @see #getCoverageMappingRule()
	 * @generated
	 */
	void setCoverageMappingRule(MappingRuleType value);

	/**
	 * Returns the value of the '<em><b>Grid Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:GridFunction provides an explicit mapping rule for grid geometries, i.e. the domain shall be a geometry of type grid.  It describes the mapping of grid posts (discrete point grid coverage) or grid cells (discrete surface coverage) to the values in the range set.
	 * The gml:startPoint is the index position of a point in the grid that is mapped to the first point in the range set (this is also the index position of the first grid post).  If the gml:startPoint property is omitted the gml:startPoint is assumed to be equal to the value of gml:low in the gml:Grid geometry. Subsequent points in the mapping are determined by the value of the gml:sequenceRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grid Function</em>' containment reference.
	 * @see #setGridFunction(GridFunctionType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoverageFunctionType_GridFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GridFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	GridFunctionType getGridFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoverageFunctionType#getGridFunction <em>Grid Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Function</em>' containment reference.
	 * @see #getGridFunction()
	 * @generated
	 */
	void setGridFunction(GridFunctionType value);

} // CoverageFunctionType
