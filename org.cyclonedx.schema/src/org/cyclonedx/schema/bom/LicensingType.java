/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Licensing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getAltIds <em>Alt Ids</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getLicensor <em>Licensor</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getLicensee <em>Licensee</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getPurchaser <em>Purchaser</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getPurchaseOrder <em>Purchase Order</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getLicenseTypes <em>License Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getLastRenewal <em>Last Renewal</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getExpiration <em>Expiration</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicensingType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType()
 * @model extendedMetaData="name='licensing_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicensingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alt Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * License identifiers that may be used to manage licenses and
	 *                                     their lifecycle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Ids</em>' containment reference.
	 * @see #setAltIds(AltIdsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_AltIds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altIds' namespace='##targetNamespace'"
	 * @generated
	 */
	AltIdsType getAltIds();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getAltIds <em>Alt Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Ids</em>' containment reference.
	 * @see #getAltIds()
	 * @generated
	 */
	void setAltIds(AltIdsType value);

	/**
	 * Returns the value of the '<em><b>Licensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization that grants a license to another
	 *                                     individual or organization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensor</em>' containment reference.
	 * @see #setLicensor(LicensorType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_Licensor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licensor' namespace='##targetNamespace'"
	 * @generated
	 */
	LicensorType getLicensor();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getLicensor <em>Licensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensor</em>' containment reference.
	 * @see #getLicensor()
	 * @generated
	 */
	void setLicensor(LicensorType value);

	/**
	 * Returns the value of the '<em><b>Licensee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization for which a license was granted to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensee</em>' containment reference.
	 * @see #setLicensee(LicenseeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_Licensee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licensee' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseeType getLicensee();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getLicensee <em>Licensee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensee</em>' containment reference.
	 * @see #getLicensee()
	 * @generated
	 */
	void setLicensee(LicenseeType value);

	/**
	 * Returns the value of the '<em><b>Purchaser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization that purchased the license
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purchaser</em>' containment reference.
	 * @see #setPurchaser(PurchaserType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_Purchaser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purchaser' namespace='##targetNamespace'"
	 * @generated
	 */
	PurchaserType getPurchaser();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getPurchaser <em>Purchaser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchaser</em>' containment reference.
	 * @see #getPurchaser()
	 * @generated
	 */
	void setPurchaser(PurchaserType value);

	/**
	 * Returns the value of the '<em><b>Purchase Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purchase order identifier the purchaser sent to a supplier or
	 *                                     vendor to authorize a purchase
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purchase Order</em>' attribute.
	 * @see #setPurchaseOrder(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_PurchaseOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='purchaseOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPurchaseOrder();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getPurchaseOrder <em>Purchase Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order</em>' attribute.
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	void setPurchaseOrder(String value);

	/**
	 * Returns the value of the '<em><b>License Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of license(s) that was granted to the licensee
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License Types</em>' containment reference.
	 * @see #setLicenseTypes(LicenseTypesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_LicenseTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenseTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseTypesType getLicenseTypes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getLicenseTypes <em>License Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Types</em>' containment reference.
	 * @see #getLicenseTypes()
	 * @generated
	 */
	void setLicenseTypes(LicenseTypesType value);

	/**
	 * Returns the value of the '<em><b>Last Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timestamp indicating when the license was last
	 *                                     renewed. For new purchases, this is often the purchase or acquisition date.
	 *                                     For non-perpetual licenses or subscriptions, this is the timestamp of when the
	 *                                     license was last renewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Renewal</em>' attribute.
	 * @see #setLastRenewal(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_LastRenewal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='lastRenewal' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastRenewal();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getLastRenewal <em>Last Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Renewal</em>' attribute.
	 * @see #getLastRenewal()
	 * @generated
	 */
	void setLastRenewal(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timestamp indicating when the current license
	 *                                     expires (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_Expiration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expiration' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpiration();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicensingType#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicensingType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // LicensingType
