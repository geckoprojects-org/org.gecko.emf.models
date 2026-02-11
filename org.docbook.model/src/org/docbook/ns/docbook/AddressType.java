/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getPob <em>Pob</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getStreet <em>Street</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getCity <em>City</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getState <em>State</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getFax <em>Fax</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getOtheraddr <em>Otheraddr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getLinenumbering <em>Linenumbering</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getStartinglinenumber <em>Startinglinenumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AddressType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType()
 * @model extendedMetaData="name='address_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface AddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Inlinemediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InlinemediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlinemediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Inlinemediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inlinemediaobject' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InlinemediaobjectType> getInlinemediaobject();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Remark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RemarkType> getRemark();

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SuperscriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Superscript()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='superscript' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SuperscriptType> getSuperscript();

	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SubscriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Subscript()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subscript' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubscriptType> getSubscript();

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.XrefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Xref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<XrefType> getXref();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Link()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Olink</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OlinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Olink</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Olink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='olink' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OlinkType> getOlink();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Anchor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AnchorType> getAnchor();

	/**
	 * Returns the value of the '<em><b>Biblioref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliorefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Biblioref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BibliorefType> getBiblioref();

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AltType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Alt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AltType> getAlt();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Indexterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Indexterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm();

	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PhraseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Phrase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phrase' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PhraseType> getPhrase();

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ReplaceableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaceable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Replaceable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceable' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReplaceableType> getReplaceable();

	/**
	 * Returns the value of the '<em><b>Personname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PersonnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Personname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PersonnameType> getPersonname();

	/**
	 * Returns the value of the '<em><b>Pob</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PobType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pob</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Pob()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pob' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PobType> getPob();

	/**
	 * Returns the value of the '<em><b>Street</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.StreetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Street()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='street' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StreetType> getStreet();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_City()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CityType> getCity();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.StateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_State()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StateType> getState();

	/**
	 * Returns the value of the '<em><b>Postcode</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PostcodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcode</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Postcode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='postcode' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PostcodeType> getPostcode();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CountryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Country()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CountryType> getCountry();

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PhoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Phone()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PhoneType> getPhone();

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FaxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Fax()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fax' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FaxType> getFax();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EmailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.UriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Otheraddr</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OtheraddrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otheraddr</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Otheraddr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otheraddr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OtheraddrType> getOtheraddr();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Object value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(Object value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Object value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see #setConformance(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Object value);

	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ContinuationType7}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation</em>' attribute.
	 * @see org.docbook.ns.docbook.ContinuationType7
	 * @see #isSetContinuation()
	 * @see #unsetContinuation()
	 * @see #setContinuation(ContinuationType7)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Continuation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='continuation'"
	 * @generated
	 */
	ContinuationType7 getContinuation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getContinuation <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation</em>' attribute.
	 * @see org.docbook.ns.docbook.ContinuationType7
	 * @see #isSetContinuation()
	 * @see #unsetContinuation()
	 * @see #getContinuation()
	 * @generated
	 */
	void setContinuation(ContinuationType7 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getContinuation <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuation()
	 * @see #getContinuation()
	 * @see #setContinuation(ContinuationType7)
	 * @generated
	 */
	void unsetContinuation();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getContinuation <em>Continuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation</em>' attribute is set.
	 * @see #unsetContinuation()
	 * @see #getContinuation()
	 * @see #setContinuation(ContinuationType7)
	 * @generated
	 */
	boolean isSetContinuation();

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	Object getLanguage();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Object value);

	/**
	 * Returns the value of the '<em><b>Linenumbering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.LinenumberingType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linenumbering</em>' attribute.
	 * @see org.docbook.ns.docbook.LinenumberingType6
	 * @see #isSetLinenumbering()
	 * @see #unsetLinenumbering()
	 * @see #setLinenumbering(LinenumberingType6)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Linenumbering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='linenumbering'"
	 * @generated
	 */
	LinenumberingType6 getLinenumbering();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getLinenumbering <em>Linenumbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linenumbering</em>' attribute.
	 * @see org.docbook.ns.docbook.LinenumberingType6
	 * @see #isSetLinenumbering()
	 * @see #unsetLinenumbering()
	 * @see #getLinenumbering()
	 * @generated
	 */
	void setLinenumbering(LinenumberingType6 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getLinenumbering <em>Linenumbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinenumbering()
	 * @see #getLinenumbering()
	 * @see #setLinenumbering(LinenumberingType6)
	 * @generated
	 */
	void unsetLinenumbering();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getLinenumbering <em>Linenumbering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linenumbering</em>' attribute is set.
	 * @see #unsetLinenumbering()
	 * @see #getLinenumbering()
	 * @see #setLinenumbering(LinenumberingType6)
	 * @generated
	 */
	boolean isSetLinenumbering();

	/**
	 * Returns the value of the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkend</em>' attribute.
	 * @see #setLinkend(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(Object value);

	/**
	 * Returns the value of the '<em><b>Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap</em>' attribute.
	 * @see #setRemap(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getRemap <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap</em>' attribute.
	 * @see #getRemap()
	 * @generated
	 */
	void setRemap(Object value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Object value);

	/**
	 * Returns the value of the '<em><b>Revisionflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RevisionflagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @generated
	 */
	void setRevisionflag(RevisionflagType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revisionflag</em>' attribute is set.
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	boolean isSetRevisionflag();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecore.xml.namespace.SpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(SpaceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Space()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SpaceType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AddressType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AddressType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	boolean isSetSpace();

	/**
	 * Returns the value of the '<em><b>Startinglinenumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startinglinenumber</em>' attribute.
	 * @see #setStartinglinenumber(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Startinglinenumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='startinglinenumber'"
	 * @generated
	 */
	String getStartinglinenumber();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getStartinglinenumber <em>Startinglinenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startinglinenumber</em>' attribute.
	 * @see #getStartinglinenumber()
	 * @generated
	 */
	void setStartinglinenumber(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(Object value);

	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAddressType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AddressType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // AddressType
