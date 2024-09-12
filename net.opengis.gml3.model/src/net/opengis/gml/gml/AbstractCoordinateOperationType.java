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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordinate Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getOperationVersion <em>Operation Version</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getCoordinateOperationAccuracy <em>Coordinate Operation Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getSourceCRS <em>Source CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getTargetCRS <em>Target CRS</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCoordinateOperationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractCoordinateOperationType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' containment reference.
	 * @see #setDomainOfValidity(DomainOfValidityType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_DomainOfValidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainOfValidityType getDomainOfValidity();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getDomainOfValidity <em>Domain Of Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Of Validity</em>' containment reference.
	 * @see #getDomainOfValidity()
	 * @generated
	 */
	void setDomainOfValidity(DomainOfValidityType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:scope property provides a description of the usage, or limitations of usage, for which this CRS-related object is valid. If unknown, enter "not known".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_Scope()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getScope();

	/**
	 * Returns the value of the '<em><b>Operation Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationVersion is the version of the coordinate transformation (i.e., instantiation due to the stochastic nature of the parameters). Mandatory when describing a transformation, and should not be supplied for a conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Version</em>' attribute.
	 * @see #setOperationVersion(String)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_OperationVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='operationVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperationVersion();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getOperationVersion <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Version</em>' attribute.
	 * @see #getOperationVersion()
	 * @generated
	 */
	void setOperationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Coordinate Operation Accuracy</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.CoordinateOperationAccuracyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:coordinateOperationAccuracy is an association role to a DQ_PositionalAccuracy object as encoded in ISO/TS 19139, either referencing or containing the definition of that positional accuracy. That object contains an estimate of the impact of this coordinate operation on point accuracy. That is, it gives position error estimates for the target coordinates of this coordinate operation, assuming no errors in the source coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate Operation Accuracy</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_CoordinateOperationAccuracy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinateOperationAccuracy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoordinateOperationAccuracyType> getCoordinateOperationAccuracy();

	/**
	 * Returns the value of the '<em><b>Source CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sourceCRS is an association role to the source CRS (coordinate reference system) of this coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source CRS</em>' containment reference.
	 * @see #setSourceCRS(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_SourceCRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getSourceCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getSourceCRS <em>Source CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source CRS</em>' containment reference.
	 * @see #getSourceCRS()
	 * @generated
	 */
	void setSourceCRS(CRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Target CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:targetCRS is an association role to the target CRS (coordinate reference system) of this coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target CRS</em>' containment reference.
	 * @see #setTargetCRS(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractCoordinateOperationType_TargetCRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getTargetCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractCoordinateOperationType#getTargetCRS <em>Target CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target CRS</em>' containment reference.
	 * @see #getTargetCRS()
	 * @generated
	 */
	void setTargetCRS(CRSPropertyType value);

} // AbstractCoordinateOperationType
