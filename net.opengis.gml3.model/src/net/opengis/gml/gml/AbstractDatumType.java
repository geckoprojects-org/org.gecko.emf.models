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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractDatumType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractDatumType#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractDatumType#getAnchorDefinition <em>Anchor Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractDatumType#getRealizationEpoch <em>Realization Epoch</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractDatumType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDatumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractDatumType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' containment reference.
	 * @see #setDomainOfValidity(DomainOfValidityType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractDatumType_DomainOfValidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainOfValidityType getDomainOfValidity();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractDatumType#getDomainOfValidity <em>Domain Of Validity</em>}' containment reference.
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
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractDatumType_Scope()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getScope();

	/**
	 * Returns the value of the '<em><b>Anchor Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:anchorDefinition is a description, possibly including coordinates, of the definition used to anchor the datum to the Earth. Also known as the "origin", especially for engineering and image datums. The codeSpace attribute may be used to reference a source of more detailed on this point or surface, or on a set of such descriptions.
	 * -	For a geodetic datum, this point is also known as the fundamental point, which is traditionally the point where the relationship between geoid and ellipsoid is defined. In some cases, the "fundamental point" may consist of a number of points. In those cases, the parameters defining the geoid/ellipsoid relationship have been averaged for these points, and the averages adopted as the datum definition.
	 * -	For an engineering datum, the anchor definition may be a physical point, or it may be a point with defined coordinates in another CRS.may
	 * -	For an image datum, the anchor definition is usually either the centre of the image or the corner of the image.
	 * -	For a temporal datum, this attribute is not defined. Instead of the anchor definition, a temporal datum carries a separate time origin of type DateTime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor Definition</em>' containment reference.
	 * @see #setAnchorDefinition(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractDatumType_AnchorDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anchorDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getAnchorDefinition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractDatumType#getAnchorDefinition <em>Anchor Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Definition</em>' containment reference.
	 * @see #getAnchorDefinition()
	 * @generated
	 */
	void setAnchorDefinition(CodeType value);

	/**
	 * Returns the value of the '<em><b>Realization Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:realizationEpoch is the time after which this datum definition is valid. See ISO 19111 Table 32 for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization Epoch</em>' attribute.
	 * @see #setRealizationEpoch(XMLGregorianCalendar)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractDatumType_RealizationEpoch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='realizationEpoch' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRealizationEpoch();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractDatumType#getRealizationEpoch <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realization Epoch</em>' attribute.
	 * @see #getRealizationEpoch()
	 * @generated
	 */
	void setRealizationEpoch(XMLGregorianCalendar value);

} // AbstractDatumType
