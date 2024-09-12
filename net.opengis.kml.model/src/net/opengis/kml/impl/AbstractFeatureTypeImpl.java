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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.AbstractStyleSelectorType;
import net.opengis.kml.AbstractTimePrimitiveType;
import net.opengis.kml.AbstractViewType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.MetadataType;
import net.opengis.kml.RegionType;
import net.opengis.kml.SnippetType;

import oasis.names.tc.ciq.xsdschema.xAL.AddressDetails;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.AtomPersonConstruct;
import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAddressDetails <em>Address Details</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getSnippet1 <em>Snippet1</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractTimePrimitiveGroupGroup <em>Abstract Time Primitive Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractFeatureSimpleExtensionGroupGroup <em>Abstract Feature Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractFeatureObjectExtensionGroupGroup <em>Abstract Feature Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractFeatureTypeImpl#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFeatureTypeImpl extends AbstractObjectTypeImpl implements AbstractFeatureType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBILITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean open = OPEN_EDEFAULT;

	/**
	 * This is true if the Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openESet;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AtomPersonConstruct author;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected LinkType link;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddressDetails() <em>Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetails()
	 * @generated
	 * @ordered
	 */
	protected AddressDetails addressDetails;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSnippet() <em>Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected SnippetType snippet;

	/**
	 * The default value of the '{@link #getSnippet1() <em>Snippet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet1()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippet1() <em>Snippet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet1()
	 * @generated
	 * @ordered
	 */
	protected String snippet1 = SNIPPET1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractViewGroupGroup() <em>Abstract View Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractViewGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractViewGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractTimePrimitiveGroupGroup() <em>Abstract Time Primitive Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTimePrimitiveGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTimePrimitiveGroupGroup;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected String styleUrl = STYLE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractStyleSelectorGroupGroup() <em>Abstract Style Selector Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStyleSelectorGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStyleSelectorGroupGroup;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected RegionType region;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected MetadataType metadata;

	/**
	 * The cached value of the '{@link #getExtendedData() <em>Extended Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedDataType extendedData;

	/**
	 * The cached value of the '{@link #getAbstractFeatureSimpleExtensionGroupGroup() <em>Abstract Feature Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractFeatureObjectExtensionGroupGroup() <em>Abstract Feature Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractFeatureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(boolean newVisibility) {
		boolean oldVisibility = visibility;
		visibility = newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVisibility() {
		boolean oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen(boolean newOpen) {
		boolean oldOpen = open;
		open = newOpen;
		boolean oldOpenESet = openESet;
		openESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN, oldOpen, open, !oldOpenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOpen() {
		boolean oldOpen = open;
		boolean oldOpenESet = openESet;
		open = OPEN_EDEFAULT;
		openESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN, oldOpen, OPEN_EDEFAULT, oldOpenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOpen() {
		return openESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomPersonConstruct getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AtomPersonConstruct newAuthor, NotificationChain msgs) {
		AtomPersonConstruct oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(AtomPersonConstruct newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		LinkType oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(LinkType newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressDetails(AddressDetails newAddressDetails, NotificationChain msgs) {
		AddressDetails oldAddressDetails = addressDetails;
		addressDetails = newAddressDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS, oldAddressDetails, newAddressDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressDetails(AddressDetails newAddressDetails) {
		if (newAddressDetails != addressDetails) {
			NotificationChain msgs = null;
			if (addressDetails != null)
				msgs = ((InternalEObject)addressDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS, null, msgs);
			if (newAddressDetails != null)
				msgs = ((InternalEObject)newAddressDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS, null, msgs);
			msgs = basicSetAddressDetails(newAddressDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS, newAddressDetails, newAddressDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnippetType getSnippet() {
		return snippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnippet(SnippetType newSnippet, NotificationChain msgs) {
		SnippetType oldSnippet = snippet;
		snippet = newSnippet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET, oldSnippet, newSnippet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnippet(SnippetType newSnippet) {
		if (newSnippet != snippet) {
			NotificationChain msgs = null;
			if (snippet != null)
				msgs = ((InternalEObject)snippet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET, null, msgs);
			if (newSnippet != null)
				msgs = ((InternalEObject)newSnippet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET, null, msgs);
			msgs = basicSetSnippet(newSnippet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET, newSnippet, newSnippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSnippet1() {
		return snippet1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnippet1(String newSnippet1) {
		String oldSnippet1 = snippet1;
		snippet1 = newSnippet1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET1, oldSnippet1, snippet1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractViewGroupGroup() {
		if (abstractViewGroupGroup == null) {
			abstractViewGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP);
		}
		return abstractViewGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractViewType getAbstractViewGroup() {
		return (AbstractViewType)getAbstractViewGroupGroup().get(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractViewGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractViewGroup(AbstractViewType newAbstractViewGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractViewGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractViewGroup(), newAbstractViewGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractTimePrimitiveGroupGroup() {
		if (abstractTimePrimitiveGroupGroup == null) {
			abstractTimePrimitiveGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP);
		}
		return abstractTimePrimitiveGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimePrimitiveType getAbstractTimePrimitiveGroup() {
		return (AbstractTimePrimitiveType)getAbstractTimePrimitiveGroupGroup().get(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractTimePrimitiveGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimePrimitiveGroup(AbstractTimePrimitiveType newAbstractTimePrimitiveGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractTimePrimitiveGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractTimePrimitiveGroup(), newAbstractTimePrimitiveGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleUrl() {
		return styleUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleUrl(String newStyleUrl) {
		String oldStyleUrl = styleUrl;
		styleUrl = newStyleUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__STYLE_URL, oldStyleUrl, styleUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractStyleSelectorGroupGroup() {
		if (abstractStyleSelectorGroupGroup == null) {
			abstractStyleSelectorGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP);
		}
		return abstractStyleSelectorGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractStyleSelectorType> getAbstractStyleSelectorGroup() {
		return getAbstractStyleSelectorGroupGroup().list(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractStyleSelectorGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionType getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(RegionType newRegion, NotificationChain msgs) {
		RegionType oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(RegionType newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__REGION, null, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__REGION, null, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		MetadataType oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(MetadataType newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedDataType getExtendedData() {
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedData(ExtendedDataType newExtendedData, NotificationChain msgs) {
		ExtendedDataType oldExtendedData = extendedData;
		extendedData = newExtendedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA, oldExtendedData, newExtendedData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedData(ExtendedDataType newExtendedData) {
		if (newExtendedData != extendedData) {
			NotificationChain msgs = null;
			if (extendedData != null)
				msgs = ((InternalEObject)extendedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA, null, msgs);
			if (newExtendedData != null)
				msgs = ((InternalEObject)newExtendedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA, null, msgs);
			msgs = basicSetExtendedData(newExtendedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA, newExtendedData, newExtendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureSimpleExtensionGroupGroup() {
		if (abstractFeatureSimpleExtensionGroupGroup == null) {
			abstractFeatureSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractFeatureSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractFeatureSimpleExtensionGroup() {
		return getAbstractFeatureSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractFeatureSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureObjectExtensionGroupGroup() {
		if (abstractFeatureObjectExtensionGroupGroup == null) {
			abstractFeatureObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractFeatureObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractFeatureObjectExtensionGroup() {
		return getAbstractFeatureObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractFeatureType_AbstractFeatureObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__LINK:
				return basicSetLink(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS:
				return basicSetAddressDetails(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET:
				return basicSetSnippet(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractViewGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP:
				return basicSetAbstractViewGroup(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractTimePrimitiveGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return basicSetAbstractTimePrimitiveGroup(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__REGION:
				return basicSetRegion(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA:
				return basicSetMetadata(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA:
				return basicSetExtendedData(null, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractFeatureObjectExtensionGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_FEATURE_TYPE__NAME:
				return getName();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY:
				return isVisibility();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN:
				return isOpen();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR:
				return getAuthor();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__LINK:
				return getLink();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS:
				return getAddress();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS:
				return getAddressDetails();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__PHONE_NUMBER:
				return getPhoneNumber();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET:
				return getSnippet();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET1:
				return getSnippet1();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION:
				return getDescription();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				if (coreType) return getAbstractViewGroupGroup();
				return ((FeatureMap.Internal)getAbstractViewGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP:
				if (coreType) return getAbstractTimePrimitiveGroupGroup();
				return ((FeatureMap.Internal)getAbstractTimePrimitiveGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return getAbstractTimePrimitiveGroup();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__STYLE_URL:
				return getStyleUrl();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				if (coreType) return getAbstractStyleSelectorGroupGroup();
				return ((FeatureMap.Internal)getAbstractStyleSelectorGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return getAbstractStyleSelectorGroup();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__REGION:
				return getRegion();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA:
				return getMetadata();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA:
				return getExtendedData();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractFeatureSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP:
				return getAbstractFeatureSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractFeatureObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return getAbstractFeatureObjectExtensionGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_FEATURE_TYPE__NAME:
				setName((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY:
				setVisibility((Boolean)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN:
				setOpen((Boolean)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR:
				setAuthor((AtomPersonConstruct)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__LINK:
				setLink((LinkType)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET:
				setSnippet((SnippetType)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET1:
				setSnippet1((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractViewGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractTimePrimitiveGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractStyleSelectorGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__REGION:
				setRegion((RegionType)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA:
				setMetadata((MetadataType)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA:
				setExtendedData((ExtendedDataType)newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureObjectExtensionGroupGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_FEATURE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY:
				unsetVisibility();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN:
				unsetOpen();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR:
				setAuthor((AtomPersonConstruct)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__LINK:
				setLink((LinkType)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET:
				setSnippet((SnippetType)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET1:
				setSnippet1(SNIPPET1_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				getAbstractViewGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP:
				getAbstractTimePrimitiveGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				getAbstractStyleSelectorGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__REGION:
				setRegion((RegionType)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA:
				setMetadata((MetadataType)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA:
				setExtendedData((ExtendedDataType)null);
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractFeatureSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractFeatureObjectExtensionGroupGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_FEATURE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__VISIBILITY:
				return isSetVisibility();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__OPEN:
				return isSetOpen();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__AUTHOR:
				return author != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__LINK:
				return link != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS:
				return addressDetails != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET:
				return snippet != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__SNIPPET1:
				return SNIPPET1_EDEFAULT == null ? snippet1 != null : !SNIPPET1_EDEFAULT.equals(snippet1);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				return abstractViewGroupGroup != null && !abstractViewGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup() != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP:
				return abstractTimePrimitiveGroupGroup != null && !abstractTimePrimitiveGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return getAbstractTimePrimitiveGroup() != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? styleUrl != null : !STYLE_URL_EDEFAULT.equals(styleUrl);
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				return abstractStyleSelectorGroupGroup != null && !abstractStyleSelectorGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return !getAbstractStyleSelectorGroup().isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__REGION:
				return region != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__METADATA:
				return metadata != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__EXTENDED_DATA:
				return extendedData != null;
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractFeatureSimpleExtensionGroupGroup != null && !abstractFeatureSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP:
				return !getAbstractFeatureSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractFeatureObjectExtensionGroupGroup != null && !abstractFeatureObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return !getAbstractFeatureObjectExtensionGroup().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", open: ");
		if (openESet) result.append(open); else result.append("<unset>");
		result.append(", address: ");
		result.append(address);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", snippet1: ");
		result.append(snippet1);
		result.append(", description: ");
		result.append(description);
		result.append(", abstractViewGroupGroup: ");
		result.append(abstractViewGroupGroup);
		result.append(", abstractTimePrimitiveGroupGroup: ");
		result.append(abstractTimePrimitiveGroupGroup);
		result.append(", styleUrl: ");
		result.append(styleUrl);
		result.append(", abstractStyleSelectorGroupGroup: ");
		result.append(abstractStyleSelectorGroupGroup);
		result.append(", abstractFeatureSimpleExtensionGroupGroup: ");
		result.append(abstractFeatureSimpleExtensionGroupGroup);
		result.append(", abstractFeatureObjectExtensionGroupGroup: ");
		result.append(abstractFeatureObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractFeatureTypeImpl
