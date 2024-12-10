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
package ee.jakarta.xml.ns.persistence.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
 *         public @interface Column {
 *           String name() default "";
 *           boolean unique() default false;
 *           boolean nullable() default true;
 *           boolean insertable() default true;
 *           boolean updatable() default true;
 *           String columnDefinition() default "";
 *           String options() default "";
 *           String table() default "";
 *           int length() default 255;
 *           int precision() default 0; // decimal precision
 *           int scale() default 0; // decimal scale
 *           int secondPrecision() default -1; //fractional second precision
 *           CheckConstraint[] check() default {};
 *           String comment() default "";
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getComment <em>Comment</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getLength <em>Length</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#isNullable <em>Nullable</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getOptions <em>Options</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getPrecision <em>Precision</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getScale <em>Scale</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision <em>Second Precision</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#getTable <em>Table</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#isUnique <em>Unique</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn()
 * @model extendedMetaData="name='column' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Check Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Constraint</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_CheckConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='check-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CheckConstraint> getCheckConstraint();

	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_ColumnDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column-definition'"
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getColumnDefinition <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertable</em>' attribute.
	 * @see #isSetInsertable()
	 * @see #unsetInsertable()
	 * @see #setInsertable(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Insertable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='insertable'"
	 * @generated
	 */
	boolean isInsertable();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isInsertable <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertable</em>' attribute.
	 * @see #isSetInsertable()
	 * @see #unsetInsertable()
	 * @see #isInsertable()
	 * @generated
	 */
	void setInsertable(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isInsertable <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsertable()
	 * @see #isInsertable()
	 * @see #setInsertable(boolean)
	 * @generated
	 */
	void unsetInsertable();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isInsertable <em>Insertable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insertable</em>' attribute is set.
	 * @see #unsetInsertable()
	 * @see #isInsertable()
	 * @see #setInsertable(boolean)
	 * @generated
	 */
	boolean isSetInsertable();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(int)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Length()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #setNullable(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Nullable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nullable'"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	void unsetNullable();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isNullable <em>Nullable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nullable</em>' attribute is set.
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	boolean isSetNullable();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Options()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='options'"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(int)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Precision()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(int)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(int)
	 * @generated
	 */
	boolean isSetPrecision();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(int)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Scale()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='scale'"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(int)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(int)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Second Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Precision</em>' attribute.
	 * @see #isSetSecondPrecision()
	 * @see #unsetSecondPrecision()
	 * @see #setSecondPrecision(int)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_SecondPrecision()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='second-precision'"
	 * @generated
	 */
	int getSecondPrecision();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision <em>Second Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Precision</em>' attribute.
	 * @see #isSetSecondPrecision()
	 * @see #unsetSecondPrecision()
	 * @see #getSecondPrecision()
	 * @generated
	 */
	void setSecondPrecision(int value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision <em>Second Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondPrecision()
	 * @see #getSecondPrecision()
	 * @see #setSecondPrecision(int)
	 * @generated
	 */
	void unsetSecondPrecision();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision <em>Second Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Precision</em>' attribute is set.
	 * @see #unsetSecondPrecision()
	 * @see #getSecondPrecision()
	 * @see #setSecondPrecision(int)
	 * @generated
	 */
	boolean isSetSecondPrecision();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Table()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='table'"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #setUnique(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Unique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUnique <em>Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique</em>' attribute is set.
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	boolean isSetUnique();

	/**
	 * Returns the value of the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatable</em>' attribute.
	 * @see #isSetUpdatable()
	 * @see #unsetUpdatable()
	 * @see #setUpdatable(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getColumn_Updatable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='updatable'"
	 * @generated
	 */
	boolean isUpdatable();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updatable</em>' attribute.
	 * @see #isSetUpdatable()
	 * @see #unsetUpdatable()
	 * @see #isUpdatable()
	 * @generated
	 */
	void setUpdatable(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdatable()
	 * @see #isUpdatable()
	 * @see #setUpdatable(boolean)
	 * @generated
	 */
	void unsetUpdatable();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable <em>Updatable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Updatable</em>' attribute is set.
	 * @see #unsetUpdatable()
	 * @see #isUpdatable()
	 * @see #setUpdatable(boolean)
	 * @generated
	 */
	boolean isSetUpdatable();

} // Column
