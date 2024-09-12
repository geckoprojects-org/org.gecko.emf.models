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

import java.util.Collection;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.ItemIconType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.ListItemTypeEnumType;
import net.opengis.kml.ListStyleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getItemIcon <em>Item Icon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getMaxSnippetLines <em>Max Snippet Lines</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getListStyleSimpleExtensionGroupGroup <em>List Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getListStyleObjectExtensionGroupGroup <em>List Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ListStyleTypeImpl#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListStyleTypeImpl extends AbstractSubStyleTypeImpl implements ListStyleType {
	/**
	 * The default value of the '{@link #getListItemType() <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ListItemTypeEnumType LIST_ITEM_TYPE_EDEFAULT = ListItemTypeEnumType.CHECK;

	/**
	 * The cached value of the '{@link #getListItemType() <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItemType()
	 * @generated
	 * @ordered
	 */
	protected ListItemTypeEnumType listItemType = LIST_ITEM_TYPE_EDEFAULT;

	/**
	 * This is true if the List Item Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean listItemTypeESet;

	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BG_COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] bgColor = BG_COLOR_EDEFAULT;

	/**
	 * This is true if the Bg Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bgColorESet;

	/**
	 * The cached value of the '{@link #getItemIcon() <em>Item Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemIconType> itemIcon;

	/**
	 * The default value of the '{@link #getMaxSnippetLines() <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSnippetLines()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SNIPPET_LINES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getMaxSnippetLines() <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSnippetLines()
	 * @generated
	 * @ordered
	 */
	protected int maxSnippetLines = MAX_SNIPPET_LINES_EDEFAULT;

	/**
	 * This is true if the Max Snippet Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxSnippetLinesESet;

	/**
	 * The cached value of the '{@link #getListStyleSimpleExtensionGroupGroup() <em>List Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getListStyleObjectExtensionGroupGroup() <em>List Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getListStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItemTypeEnumType getListItemType() {
		return listItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListItemType(ListItemTypeEnumType newListItemType) {
		ListItemTypeEnumType oldListItemType = listItemType;
		listItemType = newListItemType == null ? LIST_ITEM_TYPE_EDEFAULT : newListItemType;
		boolean oldListItemTypeESet = listItemTypeESet;
		listItemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE, oldListItemType, listItemType, !oldListItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetListItemType() {
		ListItemTypeEnumType oldListItemType = listItemType;
		boolean oldListItemTypeESet = listItemTypeESet;
		listItemType = LIST_ITEM_TYPE_EDEFAULT;
		listItemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE, oldListItemType, LIST_ITEM_TYPE_EDEFAULT, oldListItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetListItemType() {
		return listItemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBgColor(byte[] newBgColor) {
		byte[] oldBgColor = bgColor;
		bgColor = newBgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LIST_STYLE_TYPE__BG_COLOR, oldBgColor, bgColor, !oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBgColor() {
		byte[] oldBgColor = bgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColor = BG_COLOR_EDEFAULT;
		bgColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LIST_STYLE_TYPE__BG_COLOR, oldBgColor, BG_COLOR_EDEFAULT, oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBgColor() {
		return bgColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemIconType> getItemIcon() {
		if (itemIcon == null) {
			itemIcon = new EObjectContainmentEList<ItemIconType>(ItemIconType.class, this, KMLPackage.LIST_STYLE_TYPE__ITEM_ICON);
		}
		return itemIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSnippetLines() {
		return maxSnippetLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSnippetLines(int newMaxSnippetLines) {
		int oldMaxSnippetLines = maxSnippetLines;
		maxSnippetLines = newMaxSnippetLines;
		boolean oldMaxSnippetLinesESet = maxSnippetLinesESet;
		maxSnippetLinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES, oldMaxSnippetLines, maxSnippetLines, !oldMaxSnippetLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxSnippetLines() {
		int oldMaxSnippetLines = maxSnippetLines;
		boolean oldMaxSnippetLinesESet = maxSnippetLinesESet;
		maxSnippetLines = MAX_SNIPPET_LINES_EDEFAULT;
		maxSnippetLinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES, oldMaxSnippetLines, MAX_SNIPPET_LINES_EDEFAULT, oldMaxSnippetLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxSnippetLines() {
		return maxSnippetLinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getListStyleSimpleExtensionGroupGroup() {
		if (listStyleSimpleExtensionGroupGroup == null) {
			listStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return listStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getListStyleSimpleExtensionGroup() {
		return getListStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getListStyleType_ListStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getListStyleObjectExtensionGroupGroup() {
		if (listStyleObjectExtensionGroupGroup == null) {
			listStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return listStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getListStyleObjectExtensionGroup() {
		return getListStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getListStyleType_ListStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LIST_STYLE_TYPE__ITEM_ICON:
				return ((InternalEList<?>)getItemIcon()).basicRemove(otherEnd, msgs);
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getListStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getListStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getListStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				return getListItemType();
			case KMLPackage.LIST_STYLE_TYPE__BG_COLOR:
				return getBgColor();
			case KMLPackage.LIST_STYLE_TYPE__ITEM_ICON:
				return getItemIcon();
			case KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES:
				return getMaxSnippetLines();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getListStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getListStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP:
				return getListStyleSimpleExtensionGroup();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getListStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getListStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return getListStyleObjectExtensionGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				setListItemType((ListItemTypeEnumType)newValue);
				return;
			case KMLPackage.LIST_STYLE_TYPE__BG_COLOR:
				setBgColor((byte[])newValue);
				return;
			case KMLPackage.LIST_STYLE_TYPE__ITEM_ICON:
				getItemIcon().clear();
				getItemIcon().addAll((Collection<? extends ItemIconType>)newValue);
				return;
			case KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES:
				setMaxSnippetLines((Integer)newValue);
				return;
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getListStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getListStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				unsetListItemType();
				return;
			case KMLPackage.LIST_STYLE_TYPE__BG_COLOR:
				unsetBgColor();
				return;
			case KMLPackage.LIST_STYLE_TYPE__ITEM_ICON:
				getItemIcon().clear();
				return;
			case KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES:
				unsetMaxSnippetLines();
				return;
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getListStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getListStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				return isSetListItemType();
			case KMLPackage.LIST_STYLE_TYPE__BG_COLOR:
				return isSetBgColor();
			case KMLPackage.LIST_STYLE_TYPE__ITEM_ICON:
				return itemIcon != null && !itemIcon.isEmpty();
			case KMLPackage.LIST_STYLE_TYPE__MAX_SNIPPET_LINES:
				return isSetMaxSnippetLines();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return listStyleSimpleExtensionGroupGroup != null && !listStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getListStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return listStyleObjectExtensionGroupGroup != null && !listStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return !getListStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (listItemType: ");
		if (listItemTypeESet) result.append(listItemType); else result.append("<unset>");
		result.append(", bgColor: ");
		if (bgColorESet) result.append(bgColor); else result.append("<unset>");
		result.append(", maxSnippetLines: ");
		if (maxSnippetLinesESet) result.append(maxSnippetLines); else result.append("<unset>");
		result.append(", listStyleSimpleExtensionGroupGroup: ");
		result.append(listStyleSimpleExtensionGroupGroup);
		result.append(", listStyleObjectExtensionGroupGroup: ");
		result.append(listStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ListStyleTypeImpl
